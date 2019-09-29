package anroid.threadhandler.com.myapplication.adapter

import android.databinding.DataBindingUtil
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import anroid.threadhandler.com.myapplication.R
import anroid.threadhandler.com.myapplication.databinding.LayoutNewsItemBinding
import anroid.threadhandler.com.myapplication.retrofit.model.Children
import anroid.threadhandler.com.myapplication.retrofit.model.DataX


class NewsListAdapter : RecyclerView.Adapter<NewsListAdapter.ViewHolder>() {

    lateinit var binding: LayoutNewsItemBinding
    lateinit var listener: OnItemClickListener
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
        holder.binding.item.setOnClickListener {
            listener.onClick(it,dataList?.get(position)!!.data)
        }
    }

    fun setData(list: List<Children>?) {
        this.dataList = list
        notifyDataSetChanged()
    }

    interface OnItemClickListener {
        fun onClick(view: View, data: DataX)
    }

    fun setOnItemClickListener(listener: OnItemClickListener) {
        this.listener = listener
    }

    inner class ViewHolder(val binding: LayoutNewsItemBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bind(item: DataX) {

            with(binding){
                binding.data = item
                binding.executePendingBindings()

            }
        }
    }
}
