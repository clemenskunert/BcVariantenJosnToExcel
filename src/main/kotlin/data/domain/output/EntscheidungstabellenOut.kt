package com.renner.actionnumbersave.framework.data.domain.output

import com.google.gson.annotations.SerializedName

/*
Entscheidungstabellen Definition 5022797
 */
data class EntscheidungstabellenOut(
    @SerializedName("Code")
    val code: String,
    @SerializedName("Beschreibung")
    val beschreibung: String,
    @SerializedName("Referenzart")
    val referenzArt: Int = 0,
    @SerializedName("Bedingungsset Code")
    val bedingungssetCode: String,
    @SerializedName("Aktionsset Code")
    val akteionssetCode: String,
    @SerializedName("Art")
    val art: Int,
    @SerializedName("Nicht plausible Ausprägungen ausblenden")
    val nPlauAusprAusb: Boolean,
    @SerializedName("Verwendung")
    val verwendung: Int = 0
)