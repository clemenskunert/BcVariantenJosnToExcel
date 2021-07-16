package com.renner.actionnumbersave.framework.data.output

import com.google.gson.annotations.SerializedName

/*
Klassensachmerkmal 5022709
 */
data class KlassensachmerkmalOut(
    @SerializedName("Klassenart")
    val klassenart: Int = 0,
    @SerializedName("Klassencode")
    val klassencode: String,
    @SerializedName("Lfd. Nr.")
    val lfdNr: Int,
    @SerializedName("Sachmerkmalcode")
    val sachmekermalCode: String,
    @SerializedName("Muß/Kann")
    val mussKann: Int = 1,
    @SerializedName("Eindeutiges Suchen")
    val eindeutigesSuchen: Boolean = false,
    @SerializedName("Prüfverfahren")
    val pruefverfahren: Int = 1,
    @SerializedName("Prüfung")
    val pruefung: String,
    @SerializedName("Länge")
    val laenge: Int,
    @SerializedName("Dezimalstellen")
    val dezimalStellen: Int,
    @SerializedName("Kurzeingabe")
    val kurzeingabe: Boolean = true,
    @SerializedName("Subvariante Lagerhaltung relevant")
    val subLagRel: Boolean = true,
    @SerializedName("Ausprägung leer erlaubt")
    val auspLeerErl: Boolean = false,
    @SerializedName("Beschreibung Parameternr.")
    val beschParaNr: Int = 0
)