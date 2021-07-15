package data.domain

import com.google.gson.annotations.SerializedName

/*
Klasse 5022702
 */
data class KlasseOut(
    @SerializedName("Klassenart")
    val klassenart: Int = 0,
    @SerializedName("Code")
    val code: String,
    @SerializedName("Beschreibung")
    val beschreibung: String,
    @SerializedName("Suchbegriff")
    val suchbegriff: String,
    @SerializedName("Status")
    val status: Int = 0,
    @SerializedName("Änderung")
    val aenderung: Boolean = false
)

