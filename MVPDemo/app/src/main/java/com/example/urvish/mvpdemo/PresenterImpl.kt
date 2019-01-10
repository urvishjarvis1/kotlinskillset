package com.example.urvish.mvpdemo

/**
 * Created by urvish on 29/1/18.
 */

class PresenterImpl(private val mMainView: MainView) : Presenter {
    private var mFirstName: String? = null
    private var mLastName: String? = null
    override fun getData() {
        mFirstName = "Urvish"
        mLastName = "Rana"
        mMainView.setView(mFirstName!!, mLastName!!)
    }


}
