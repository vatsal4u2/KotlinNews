package anroid.threadhandler.com.myapplication.vm

import android.content.Context
import anroid.threadhandler.com.myapplication.R
import anroid.threadhandler.com.myapplication.retrofit.model.DataX
import java.util.*

class DetailNewsViewModel(internal var context: Context) : Observable() {
    var item :DataX ?= null

    val body : String?
        get() = item!!.selftext

    val thumbnail : String?
        get() = item?.secureMedia?.oembed?.thumbnailUrl ?:""

    val title : String?
        get() = item!!.title

    val errorText : String?
        get()= context.getString(R.string.no_content)

    fun setData(item:DataX?){
        this.item = item
    }
}