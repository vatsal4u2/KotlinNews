package anroid.threadhandler.com.myapplication.ui

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import anroid.threadhandler.com.myapplication.MyAppClass.Companion.appContext
import anroid.threadhandler.com.myapplication.R
import anroid.threadhandler.com.myapplication.databinding.ActivityMainBinding
import anroid.threadhandler.com.myapplication.retrofit.model.DataX

class MainActivity : AppCompatActivity() {

    override fun onResume() {
        super.onResume()
        appContext.activityContext = this
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        // add fragment if this is first creation.
        if(savedInstanceState == null){
            setMainFragment()
        }

    }

    fun goTo(item: DataX?){
        Toast.makeText(this, "DetailListFragment",Toast.LENGTH_LONG).show()
        supportFragmentManager
            .beginTransaction()
            .addToBackStack(null)
            .replace(R.id.container,DetailNewsFragment.newInstance(item))
            .commitAllowingStateLoss()
    }

    fun setMainFragment(){
        val fragment = NewsListFragment.newInstance()
        supportFragmentManager.beginTransaction()
            .add(R.id.container,fragment)
            .commitAllowingStateLoss()
    }


}
