package anroid.threadhandler.com.myapplication.adapter

import android.databinding.DataBindingUtil
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import anroid.threadhandler.com.myapplication.R
import anroid.threadhandler.com.myapplication.databinding.LayoutNewsItemBinding
import anroid.threadhandler.com.myapplication.retrofit.DataModel

class NewsListAdapter : RecyclerView.Adapter<NewsListAdapter.ViewHolder>() {

    lateinit var binding:LayoutNewsItemBinding

    private var dataList:List<DataModel> ?= null
    init{
        this.dataList = emptyList<DataModel>()
    }
    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): ViewHolder {
        binding = DataBindingUtil.inflate(
           LayoutInflater.from(parent.context),
           R.layout.layout_news_item,parent,false)
        return ViewHolder(binding)
    }


    override fun getItemCount(): Int {
       return dataList!!.size
    }

    override fun onBindViewHolder(p0: ViewHolder, p1: Int) {

    }

    fun setData(){
        //TODO we need to get data here and update
        notifyDataSetChanged()
    }

    inner class ViewHolder (itemView: LayoutNewsItemBinding): RecyclerView.ViewHolder(binding.root) {


    }
}
