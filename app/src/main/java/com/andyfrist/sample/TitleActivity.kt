package com.andyfrist.sample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.*
import com.andyfrist.fitstatusbarlibrary.StatusBarUtil
import kotlinx.android.synthetic.main.activity_title.*

class TitleActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        StatusBarUtil.translucentStatusBar(this)
        setContentView(R.layout.activity_title)

        val imageView = ImageView(this)
        val imageViewparams: LinearLayout.LayoutParams = LinearLayout.LayoutParams(
            StatusBarUtil.dp2px(this, 30f),
            StatusBarUtil.dp2px(this, 30f)
        )
        imageViewparams.gravity = Gravity.CENTER_VERTICAL
        imageViewparams.marginStart = StatusBarUtil.dp2px(this, 15f)
        imageView.layoutParams = imageViewparams
        imageView.setImageResource(R.mipmap.ic_category_0)

        val textView = TextView(this)
        val textparams: LinearLayout.LayoutParams = LinearLayout.LayoutParams(
            StatusBarUtil.dp2px(this, 30f),
            StatusBarUtil.dp2px(this, 30f)
        )
        textparams.gravity = Gravity.CENTER_VERTICAL
        textparams.marginStart = StatusBarUtil.dp2px(this, 15f)
        textView.layoutParams = textparams
        textView.gravity = Gravity.CENTER_VERTICAL
        textView.setText("TextView")

        titleMain.addViewAttitleRightLL(textView,imageView)


        val checkBox = CheckBox(this)
        val checkBoxparams: LinearLayout.LayoutParams = LinearLayout.LayoutParams(
            StatusBarUtil.dp2px(this, 130f),
            StatusBarUtil.dp2px(this, 30f)
        )
        checkBoxparams.gravity = Gravity.CENTER_VERTICAL
        checkBoxparams.marginStart = StatusBarUtil.dp2px(this, 1f)
        checkBox.setText("同意")
        checkBox.layoutParams = checkBoxparams

        checkBox.setOnCheckedChangeListener { compoundButton, b ->
            if (b){
                Toast.makeText(this,"同意",Toast.LENGTH_LONG).show()
            }else{
                Toast.makeText(this,"同意",Toast.LENGTH_LONG).show()
            }
        }

        val button = Button(this)
        button.text = "按钮"
        titleMain.addViewAttitleLeftLL( button, checkBox)
        button.setOnClickListener { finish() }

    }
}
