package anroid.threadhandler.com.myapplication.adapter

import android.databinding.DataBindingUtil
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import anroid.threadhandler.com.myapplication.R
import anroid.threadhandler.com.myapplication.databinding.LayoutNewsItemBinding
import anroid.threadhandler.com.myapplication.retrofit.Children
import anroid.threadhandler.com.myapplication.retrofit.DataX
import anroid.threadhandler.com.myapplication.vm.ItemViewModel


class NewsListAdapter : RecyclerView.Adapter<NewsListAdapter.ViewHolder>() {

    lateinit var binding: LayoutNewsItemBinding
    private var dataList: List<Children>? = null

    init {
        this.dataList = emptyList<Children>()
    }

    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): ViewHolder {

        binding = DataBindingUtil.inflate(
            LayoutInflater.from(parent.context),
            R.layout.layout_news_item, parent, false
        )
        return ViewHolder(binding)
    }


    override fun getItemCount(): Int {
        return dataList!!.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(dataList?.get(position)!!.data)
    }

    fun setData(list: List<Children>) {
        this.dataList = list
        notifyDataSetChanged()
    }

    inner class ViewHolder(internal var local: LayoutNewsItemBinding) : RecyclerView.ViewHolder(local.item) {

        fun bind(item: DataX) {
            if (local.itemViewModel == null) {
                local.setItemViewModel(ItemViewModel(itemView.context, item))
            } else {
                local.itemViewModel!!.setData(item)
            }
        }
    }
}
