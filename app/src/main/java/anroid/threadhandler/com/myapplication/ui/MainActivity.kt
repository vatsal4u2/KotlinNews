package anroid.threadhandler.com.myapplication.ui

import android.database.DatabaseUtils
import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import anroid.threadhandler.com.myapplication.R
import anroid.threadhandler.com.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        val fragment = NewsListFragment.newInstance()
        supportFragmentManager.beginTransaction().add(R.id.container,fragment).commitAllowingStateLoss()
    }
}
