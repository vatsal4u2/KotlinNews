package anroid.threadhandler.com.myapplication.retrofit


import com.google.gson.annotations.SerializedName

data class CustomDataModel(
    @SerializedName("data")
    val data: Data,
    @SerializedName("kind")
    val kind: String
)