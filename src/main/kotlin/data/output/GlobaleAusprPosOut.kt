package com.renner.actionnumbersave.framework.data.output

import com.google.gson.annotations.SerializedName

/*
Globale Auspr.-Pos 5022715
 */
data class GlobaleAusprPosOut(
    @SerializedName("Sachmerkmalscode")
    val sachmerkmalCode: String,
    @SerializedName("Ausprägung")
    val auspraegung: String,
    @SerializedName("Beschreibung")
    val beschreibung: String,
    @SerializedName("Nummmerischer Wert")
    val numVal: Float
)