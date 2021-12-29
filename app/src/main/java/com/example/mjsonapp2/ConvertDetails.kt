package com.example.mjsonapp2

import com.google.gson.JsonObject
import com.google.gson.annotations.SerializedName
import org.json.JSONArray
import java.util.*

class ConvertDetails {

    @SerializedName("date")
    var date: String? = null

    @SerializedName("eur")
    var eur: JsonObject? = null

}