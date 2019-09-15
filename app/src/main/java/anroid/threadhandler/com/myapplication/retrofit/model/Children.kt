package anroid.threadhandler.com.myapplication.retrofit.model


import com.google.gson.annotations.SerializedName

data class Children(
    @SerializedName("data")
    val data: DataX,
    @SerializedName("kind")
    val kind: String
)