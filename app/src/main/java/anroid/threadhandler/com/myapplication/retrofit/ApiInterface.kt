package anroid.threadhandler.com.myapplication.retrofit



import anroid.threadhandler.com.myapplication.retrofit.model.CustomDataModel
import retrofit2.Call
import retrofit2.http.GET


interface ApiInterface {

     @GET(".json")
    fun getNewsList(): Call<CustomDataModel>


}