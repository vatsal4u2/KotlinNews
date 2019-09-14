package anroid.threadhandler.com.myapplication.ui

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.DividerItemDecoration
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import anroid.threadhandler.com.myapplication.R
import anroid.threadhandler.com.myapplication.adapter.NewsListAdapter
import anroid.threadhandler.com.myapplication.databinding.LayoutNewsListFragmentBinding
import anroid.threadhandler.com.myapplication.vm.NewsListViewModel
import java.util.*

class NewsListFragment : Fragment(), Observer {

    lateinit var newsListViewModel: NewsListViewModel
    lateinit var binding: LayoutNewsListFragmentBinding


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        binding = DataBindingUtil.inflate(
            LayoutInflater.from(context),
            R.layout.layout_news_list_fragment,
            null,
            false
        )
        binding.lifecycleOwner = this

        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        newsListViewModel = NewsListViewModel(context!!)
        binding.recyclerView.apply {
            val adapter = NewsListAdapter()
            val layoutManager = LinearLayoutManager(context)
            this.layoutManager = layoutManager
            this.adapter = adapter
            this.hasFixedSize()
            this.addItemDecoration(DividerItemDecoration(context, layoutManager.orientation))
        }

        binding.newsListViewModel = newsListViewModel


        setupObserver(newsListViewModel)
    }


    private fun setupObserver(observable: Observable) {
        observable.addObserver(this)
    }

    // note : Observer call back method.
    override fun update(p0: Observable?, p1: Any?) {
        if (p0 is NewsListViewModel) {
            val adapter = binding.recyclerView.adapter as NewsListAdapter
            adapter.setData(newsListViewModel.getNewsList())
        }
    }

    companion object {
        fun newInstance(): NewsListFragment {
            return NewsListFragment()
        }
    }

}