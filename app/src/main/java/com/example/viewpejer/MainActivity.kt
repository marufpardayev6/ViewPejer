package com.example.viewpejer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.viewpejer.conection.Servis
import com.example.viewpejer.conection.UserClien
import com.example.viewpejer.databinding.ActivityMainBinding
import com.example.viewpejer.post.request.ReqUser
import com.example.viewpejer.post.respons.ResUser
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import kotlin.math.log

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val retrofit = UserClien.apiServis

        retrofit.insertUser(ReqUser("programing","Maruf")).enqueue(object :Callback<ResUser>{
            override fun onResponse(call: Call<ResUser>, response: Response<ResUser>) {
                if (response.isSuccessful){
                    Log.d("AAA", "onResponse: $response")
                }
            }

            override fun onFailure(call: Call<ResUser>, t: Throwable) {

            }
        })



    }
}