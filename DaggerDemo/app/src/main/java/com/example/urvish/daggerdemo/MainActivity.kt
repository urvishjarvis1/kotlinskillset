package com.example.urvish.daggerdemo

import android.os.Bundle
import android.support.annotation.RequiresPermission
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.widget.Toast
import com.example.urvish.daggerdemo.interfaces.RandomUserApi
import com.example.urvish.daggerdemo.model.RandomUser
import com.squareup.picasso.Picasso
import dagger.android.AndroidInjection
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var randomUserApi: RandomUserApi
    @Inject
    lateinit var picasso: Picasso


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        AndroidInjection.inject(this)
        Toast.makeText(this, "Toast using Qualifier Annotation object", Toast.LENGTH_SHORT).show()
        initViews()
        callApi()
    }

    @RequiresPermission(android.Manifest.permission.INTERNET)
    private fun callApi() {
        val randomUserCall = randomUserApi.getRandomUser()
        randomUserCall.enqueue(object : Callback<RandomUser> {
            override fun onFailure(call: Call<RandomUser>, t: Throwable) {
                Log.e("MainActivity", "request has been failed with " + t.localizedMessage)
            }

            override fun onResponse(call: Call<RandomUser>, response: Response<RandomUser>) {
                if (response.isSuccessful) {
                    val randomUser = response.body()
                    val nameto =
                        randomUser!!.results.get(0).name.component1() + " " + randomUser!!.results.get(0).name.component2() + " " + randomUser!!.results.get(
                            0
                        ).name.component3()
                    name.setText(nameto)
                    val addressto =
                        randomUser!!.results.get(0).location.component1() + ", \n" + randomUser!!.results.get(0).location.component2() + ",\n " + randomUser!!.results.get(
                            0
                        ).location.component3() + ",\n" + randomUser!!.results.get(0).location.component4()
                    address.setText(addressto)
                    email.setText(randomUser!!.results.get(0).email)
                    picasso.load(randomUser!!.results.get(0).picture.large).into(profileImg)
                }
            }
        })

    }

    private fun initViews() {
        refresh.setOnClickListener({
            Toast.makeText(applicationContext, "Testing using Application context", Toast.LENGTH_LONG).show()
            callApi()
        })
    }
}
