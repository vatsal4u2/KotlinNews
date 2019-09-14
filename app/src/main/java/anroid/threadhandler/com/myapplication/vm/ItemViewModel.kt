package anroid.threadhandler.com.myapplication.vm

import android.content.Context
import anroid.threadhandler.com.myapplication.retrofit.DataX
import java.util.*

class ItemViewModel(internal var context: Context,private var itemData:DataX): Observable() {
    val title : String?
        get() = itemData!!.title

    val thumbnail : String?
        get() = itemData.thumbnail

    fun setData(itemData: DataX){
        this.itemData = itemData
    }
}