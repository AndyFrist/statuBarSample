package com.andyfrist.sample

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.andyfrist.fitstatusbarlibrary.StatusBarUtil
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        StatusBarUtil.translucentStatusBar(this)
        setContentView(R.layout.activity_main)
//返回按钮有默认finish功能，当然也可以复写点击事件
//        commonTitleView.setTitleBackIvClickListener { finish() }
        commonTitleView.setTitleBackTvClickListener { Toast.makeText(this,"取消",Toast.LENGTH_LONG).show()  }
        commonTitleView.setTitleRightIvClickListener { startActivity(Intent(this,TitleActivity::class.java)) }
        commonTitleView.setTitleRightTvClickListener { Toast.makeText(this,"分享",Toast.LENGTH_LONG).show() }
    }
}
