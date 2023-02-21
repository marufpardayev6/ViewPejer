package com.example.viewpejer.models

import com.google.gson.annotations.SerializedName

data class SinglerUser(
    @SerializedName("data")
    val `data`: Data,
    val support: Support
)