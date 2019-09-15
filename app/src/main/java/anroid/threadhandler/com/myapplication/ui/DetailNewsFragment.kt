package anroid.threadhandler.com.myapplication.ui

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import anroid.threadhandler.com.myapplication.NewsApp.Companion.appContext
import anroid.threadhandler.com.myapplication.R
import anroid.threadhandler.com.myapplication.databinding.LayoutNewsDetailFragmentBinding
import anroid.threadhandler.com.myapplication.retrofit.model.DataX
import anroid.threadhandler.com.myapplication.vm.DetailNewsViewModel
import java.util.*

class DetailNewsFragment:Fragment(), Observer {

    lateinit var binding:LayoutNewsDetailFragmentBinding
    lateinit var viewModel : DetailNewsViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        binding = DataBindingUtil.inflate(inflater,
            R.layout.layout_news_detail_fragment,
            container,
            false)
        viewModel = DetailNewsViewModel(context!!)
        binding.lifecycleOwner = this
        binding.detialNewsViewModel = viewModel
        val toolbar = binding.toolbar
        toolbar.setNavigationIcon(R.drawable.ic_back_arrow)
        toolbar.setNavigationOnClickListener(View.OnClickListener {
            appContext.activityContext?.onBackPressed()
        })

        viewModel.setData(arguments?.getSerializable(NEWS_ITEM) as DataX)
        setupObserver(viewModel)


        return binding.root
    }

    private fun setupObserver(observable: Observable) {
        observable.addObserver(this)
    }

    override fun update(p0: Observable?, p1: Any?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    companion object {
        fun newInstance(item : DataX?): DetailNewsFragment {
            val fragment = DetailNewsFragment()
            val args = Bundle()
            args.putSerializable(NEWS_ITEM, item)
            fragment.setArguments(args)

            return fragment
        }

        const val NEWS_ITEM = "news_item"
    }


}