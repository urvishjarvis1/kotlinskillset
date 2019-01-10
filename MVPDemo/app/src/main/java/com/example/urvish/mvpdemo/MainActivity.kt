package com.example.urvish.mvpdemo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity(), MainView, View.OnClickListener {
    private var mButtonShow: Button? = null
    private var mFirstNameTextView: TextView? = null
    private var mLastNameTextView: TextView? = null
    private var mPresenter: PresenterImpl? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mButtonShow = findViewById<View>(R.id.btn_show) as Button
        mFirstNameTextView = findViewById<View>(R.id.txt_fname) as TextView
        mLastNameTextView = findViewById<View>(R.id.txt_lname) as TextView
        mButtonShow!!.setOnClickListener(this)
        mPresenter = PresenterImpl(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.btn_show -> mPresenter!!.getData()
            else -> Toast.makeText(this, "press button", Toast.LENGTH_SHORT).show()
        }

    }

    override fun setView(fname: String, lname: String) {
        mFirstNameTextView!!.visibility = View.VISIBLE
        mLastNameTextView!!.visibility = View.VISIBLE
        mFirstNameTextView!!.text = fname
        mLastNameTextView!!.text = lname


    }

    object GravitationalForce {
        fun gravitationalForce(x: Double, y: Double, r: Double): Double {
            return (6.75 * Math.pow((10).toDouble(), (-11) * x * y) / Math.pow(r, (2).toDouble()))
        }
    }
}
