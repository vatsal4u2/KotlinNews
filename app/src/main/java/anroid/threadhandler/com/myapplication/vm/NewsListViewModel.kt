package anroid.threadhandler.com.myapplication.vm

import android.content.Context
import android.databinding.ObservableField
import android.databinding.ObservableInt
import android.util.Log
import android.view.View
import android.widget.Toast
import anroid.threadhandler.com.myapplication.retrofit.ApiClient
import anroid.threadhandler.com.myapplication.retrofit.ApiInterface
import anroid.threadhandler.com.myapplication.retrofit.Children
import anroid.threadhandler.com.myapplication.retrofit.CustomDataModel
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.util.*
import kotlin.collections.ArrayList

class NewsListViewModel(internal var context: Context):Observable() {

    var progressBar : ObservableInt
    var recyclerView: ObservableInt
    var newsList = ArrayList<Children>()

    init {
        progressBar = ObservableInt(View.VISIBLE)
        recyclerView = ObservableInt(View.INVISIBLE)
        fetchNewsList()
    }

    private fun fetchNewsList(){

        val apiInterface = ApiClient.client.create(ApiInterface::class.java)
        val call = apiInterface.getNewsList()


        call.enqueue(object : Callback<CustomDataModel> {
            override fun onResponse(call: Call<CustomDataModel>, response: Response<CustomDataModel>) {

                if (response.body() != null) {
                    progressBar.set(View.GONE)
                    recyclerView.set(View.VISIBLE)
                    updateNewsList(response.body()!!)
                    Log.d("response",response.body().toString())
                    Toast.makeText(context, "sucess", Toast.LENGTH_SHORT).show()
                } else {
                    progressBar.set(View.GONE)
                    Toast.makeText(context, "failure1", Toast.LENGTH_SHORT).show()
                }
            }

            override fun onFailure(call: Call<CustomDataModel>, t: Throwable) {
                progressBar.set(View.GONE)
                Toast.makeText(context, "failure2", Toast.LENGTH_SHORT).show()
                Log.d("error", t.message)
            }
        })
    }

    fun updateNewsList(body : CustomDataModel){
        body.let {
            newsList.addAll( body.data.children)
            setChanged()
            notifyObservers()
        }
    }

    fun getNewsList():List<Children>{
        return newsList
    }
}