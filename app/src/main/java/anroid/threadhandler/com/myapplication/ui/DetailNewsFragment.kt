package anroid.threadhandler.com.myapplication.ui

import android.arch.lifecycle.ViewModelProviders
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

class DetailNewsFragment:Fragment(){

    lateinit var binding:LayoutNewsDetailFragmentBinding
    lateinit var vm : DetailNewsViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        vm = ViewModelProviders.of(this).get(DetailNewsViewModel::class.java)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        binding = DataBindingUtil.inflate(inflater,
            R.layout.layout_news_detail_fragment,
            container,
            false)
        binding.detialNewsViewModel = vm
        binding.lifecycleOwner = this
        val toolbar = binding.toolbar
        toolbar.setNavigationIcon(R.drawable.ic_back_arrow)
        toolbar.setNavigationOnClickListener(View.OnClickListener {
            appContext.activityContext?.onBackPressed()
        })



        vm.setData(arguments?.getSerializable(NEWS_ITEM) as DataX)

        return binding.root
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