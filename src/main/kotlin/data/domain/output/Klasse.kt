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
