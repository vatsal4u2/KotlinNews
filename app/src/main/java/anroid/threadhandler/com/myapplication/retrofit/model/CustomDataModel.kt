package anroid.threadhandler.com.myapplication.retrofit.model


import com.google.gson.annotations.SerializedName

data class CustomDataModel(
    @SerializedName("data")
    val data: Data,
    @SerializedName("kind")
    val kind: String
)