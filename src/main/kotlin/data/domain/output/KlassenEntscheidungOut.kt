package com.renner.actionnumbersave.framework.data.domain.output

import com.google.gson.annotations.SerializedName

/*
Klassenentscheidung 5022799
 */
data class KlassenEntscheidungOut(
    @SerializedName("Klassenart")
    val klassenart: Int = 0,
    @SerializedName("Klassencode")
    val klassencode: String,
    @SerializedName("SM-Lfdnr.")
    val smLfd: Int,
    @SerializedName("Art.")
    val art: Int = 0,
    @SerializedName("Zeilennr.")
    val zeilenNum: Int,
    @SerializedName("Entscheidung Definition Code")
    val entDefCode: String
)