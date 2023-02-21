package com.example.viewpejer.conection

import com.example.viewpejer.models.SinglerUser
import com.example.viewpejer.post.request.ReqUser
import com.example.viewpejer.post.respons.ResUser
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST


interface Servis {
    @POST("api/users")
    fun insertUser(@Body reqUser: ReqUser): Call<ResUser>

    @GET("aip/user/2")
    fun getAllRestUser(): Call<SinglerUser>



}