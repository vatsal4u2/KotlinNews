package anroid.threadhandler.com.myapplication.retrofit



import retrofit2.Call
import retrofit2.http.GET


interface ApiInterface {

     @GET(".json")
    fun getNewsList(): Call<DataModel>


}