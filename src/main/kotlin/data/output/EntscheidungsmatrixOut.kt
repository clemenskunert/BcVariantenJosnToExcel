package com.renner.actionnumbersave.framework.data.domain.output

import com.google.gson.annotations.SerializedName

/*
Entscheidungsmatrix 5022798
 */
data class EntscheidungsmatrixOut(
    @SerializedName("Code")
    val code: String,
    @SerializedName("Bedingungswerte")
    val bedingungswerte: List<String>,
    @SerializedName("Reihenfolge")
    val rang: Int,
    @SerializedName("Aktionen")
    val aktionen: List<String>,
    @SerializedName("Numerischer Bedingungswerte")
    val numBedingVal: List<String>
)