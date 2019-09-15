package anroid.threadhandler.com.myapplication.vm

import android.content.Context
import android.view.View
import anroid.threadhandler.com.myapplication.MyAppClass.Companion.appContext
import anroid.threadhandler.com.myapplication.retrofit.model.DataX
import java.util.*
import com.bumptech.glide.Glide
import android.databinding.BindingAdapter
import android.databinding.ObservableField
import android.widget.ImageView


class ItemViewModel(internal var context: Context,private var itemData: DataX?): Observable() {

    companion object {
        @JvmStatic
        @BindingAdapter("thumbnailImage")
        fun loadImage(view: ImageView, imageUrl: String) {
            Glide.with(view.getContext())
                .load(imageUrl)
                .into(view)
        }
    }

    val title : String?
        get() = itemData!!.title ?:""

    val thumbnail : String?
        get() = itemData?.secureMedia?.oembed?.thumbnailUrl ?: ""

    fun setData(itemData: DataX){
        this.itemData = itemData
    }


    fun setItemClickListener(view: View){
        val currentActivity = appContext.activityContext
        currentActivity?.goTo()
    }
}