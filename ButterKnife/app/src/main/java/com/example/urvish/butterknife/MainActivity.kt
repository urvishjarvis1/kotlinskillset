package com.example.urvish.butterknife

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import butterknife.BindView
import butterknife.ButterKnife
import butterknife.OnTextChanged

class MainActivity : AppCompatActivity() {
    @BindView(R.id.textView)
    lateinit var textView:TextView
    @BindView(R.id.editText)
    lateinit var editText: EditText
    var data:String=""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ButterKnife.bind(this)
        textView.setText("This view has been set by butterknife!")

    }
    @OnTextChanged(R.id.editText)
    fun callThis(){
        data=data+editText.text
        Toast.makeText(this,data,Toast.LENGTH_LONG).show()

    }
}
