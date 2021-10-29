package com.androidhans.lab5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.viewpager.widget.ViewPager

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //建立Error等級的Log,其標籤為MainActivity訊息為onCreart
        Log.e("MainActivity","onCreate")
        //建立FragmentPagerAdapter物件
        val adapter = ViewParentAdapter(supportFragmentManager)
        //連接Adapter, 讓畫面(Fragment)與ViewPager建立關聯
        findViewById<ViewPager>(R.id.viewParent).adapter =adapter
    }

    override fun onRestart() {
        super.onRestart() //重啟，返回頁面
        Log.e("MainActivity","onRestart")
        }

    override fun onStart() {
        super.onStart() //啟動，需在onCreate或onRestart後呼叫
        Log.e("MainActivity","onStart")
        }

    override fun onResume() {
        super.onResume() //簡歷，為面可與使用者互動時呼叫
        Log.e("MainActivity","onrResume")
        }
    override fun onPause() {
        super.onPause() //畫面暫停時呼叫，返回後可繼續使用
        Log.e("MainActivity","onPause")
    }
    override fun onStop() {
        super.onStop()  //畫面停止時呼叫，使用者離開
        Log.e("MainActivity","onStop")
    }
    override fun onDestroy() {
        super.onDestroy()  //頁面銷毀時呼叫，用於釋放占用的資源
        Log.e("MainActivity","onDestroy")
    }
    }
//繼承FragmentPagerAdapter類別
class ViewParentAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {
        //回傳對應位置的 Fragment，決定頁面的呈現順序
     override fun getItem(position: Int) = when(position) {
        0 -> FirstFragment() //第一頁要呈現的 Fragment
        1 -> SecondFragment() //第二頁要呈現的 Fragment
        else -> ThirdFragment() //第三頁要呈現的 Fragment
     }
    //回傳 Fragment 頁數
    override fun getCount() = 3
}




