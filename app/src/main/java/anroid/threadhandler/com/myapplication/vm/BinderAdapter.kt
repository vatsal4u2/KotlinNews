package anroid.threadhandler.com.myapplication.vm

import android.content.Context
import android.view.View
import anroid.threadhandler.com.myapplication.NewsApp.Companion.appContext
import anroid.threadhandler.com.myapplication.retrofit.model.DataX
import java.util.*
import com.bumptech.glide.Glide
import android.databinding.BindingAdapter
import android.widget.ImageView


class BinderAdapter : Observable() {

    companion object {
        @JvmStatic
        @BindingAdapter("thumbnailImage")
        fun loadImage(view: ImageView, imageUrl: String) {
            Glide.with(view.getContext())
                .load(imageUrl)
                .into(view)
        }
    }

}