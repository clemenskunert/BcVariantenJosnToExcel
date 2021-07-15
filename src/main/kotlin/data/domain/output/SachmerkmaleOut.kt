package com.renner.actionnumbersave.framework.data.domain.output

import com.google.gson.annotations.SerializedName

/*
Sachmerkmale 5022701
 */
data class SachmerkmaleOut(
    @SerializedName("Code")
    val code: String,
    @SerializedName("Beschreibung")
    val beschreibung: String,
    @SerializedName("Datentype")
    val datenType: Int,
    @SerializedName("Art")
    val art: Int,
    @SerializedName("Länge")
    val laenge: Int,
    @SerializedName("Dezimalstellen")
    val dezimalStellen: Int,
    @SerializedName("Ausprägung leer erlaubt")
    val valueIsEmpty: Boolean = false,
    @SerializedName("Ausprägung von")
    val auspVon: Float,
    @SerializedName("Ausprägung bis")
    val auspBis: Float,
    @SerializedName("Schrittweite")
    val schritt: Float,
    @SerializedName("Standardwert")
    val stand: String,
)