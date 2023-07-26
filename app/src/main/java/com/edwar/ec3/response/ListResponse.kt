package com.edwar.ec3.response

import com.google.gson.annotations.SerializedName

data class ListResponse(@SerializedName("imagen") var imagen:String,
                        @SerializedName("enlace") var enlace:List<String>)