package anroid.threadhandler.com.myapplication

import android.app.Application
import anroid.threadhandler.com.myapplication.ui.MainActivity

class MyAppClass : Application(){

    var activityContext : MainActivity? = null

    override fun onCreate() {
        super.onCreate()
        appContext = this
    }


    companion object {
        lateinit var appContext: MyAppClass
    }

}

