package com.renner.actionnumbersave.framework.data.output

import com.google.gson.annotations.SerializedName

/*
Fert.-Stücklistenzeile 99000772
 */
data class FertStuecklistenzeileOut(
    @SerializedName("Fert.-Stücklistennr.")
    val stueckNum: String,
    @SerializedName("Versionscode")
    val versCode: String,
    @SerializedName("Zeilennummer")
    val row: Int,
    @SerializedName("Art")
    val art: Int = 0,
    @SerializedName("Nr.")
    val number: String,
    @SerializedName("Beschreibung")
    val beschreibung: String,
    @SerializedName("Einheitencode")
    val einheiten: String,
    @SerializedName("Menge")
    val quant: Float
)