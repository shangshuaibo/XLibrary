package com.ssb.xlibrary

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.ssb.library.util.ToastUtils
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn.setOnClickListener {
            ToastUtils.showMessageCenter(this, "我点击了，哈哈哈")
        }
    }
}
