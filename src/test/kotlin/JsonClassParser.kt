import data.domain.*
import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.gherkin.Feature

object JsonClassParser : Spek({
    Feature("Parse Json to ClassInput Object") {
        Scenario("create class object and parse to json String") {
            KlasseIn(
                classMeta = KlasseOut(
                    klassenart = 0,
                    code = "",
                    beschreibung = "",
                    suchbegriff = "",
                    status = 0,
                    aenderung = false
                ),
                classAttributs = listOf(
                    KlassensachmerkmalOut(
                        klassenart = 0,
                        klassencode = "",
                        lfdNr = 0,
                        sachmekermalCode = "",
                        mussKann = 0,
                        eindeutigesSuchen = false,
                        pruefverfahren = 0,
                        pruefung = "",
                        laenge = 0,
                        dezimalStellen = 0,
                        kurzeingabe = false,
                        subLagRel = false,
                        auspLeerErl = false,
                        beschParaNr = 0
                    ) to (
                            SachmerkmaleOut(
                                code = "",
                                beschreibung = "",
                                datenType = 0,
                                art = 0,
                                laenge = 0,
                                dezimalStellen = 0,
                                valueIsEmpty = false,
                                auspVon = 0.0f,
                                auspBis = 0.0f,
                                schritt = 0.0f,
                                stand = ""
                            ) to listOf(
                                GlobaleAusprPosOut(
                                    sachmerkmalCode = "",
                                    auspraegung = "",
                                    beschreibung = "",
                                    numVal = 0.0f
                                )
                            )
                            )
                ),
                classDecision = listOf(
                    KlassenEntscheidungOut(
                        klassenart = 0,
                        klassencode = "",
                        smLfd = 0,
                        art = 0,
                        zeilenNum = 0,
                        entDefCode = ""
                    ) to (EntscheidungstabellenOut(
                        code = "",
                        beschreibung = "",
                        referenzArt = 0,
                        bedingungssetCode = "",
                        akteionssetCode = "",
                        art = 0,
                        nPlauAusprAusb = false,
                        verwendung = 0
                    ) to EntscheidungsmatrixOut(
                        code = "",
                        bedingungswerte = listOf(),
                        rang = 0,
                        aktionen = listOf(),
                        numBedingVal = listOf()
                    ))
                ),
                classRelationShip = listOf(
                    KlasseIn(
                        classMeta = KlasseOut(
                            klassenart = 0,
                            code = "",
                            beschreibung = "",
                            suchbegriff = "",
                            status = 0,
                            aenderung = false
                        ), classAttributs = listOf(), classDecision = listOf(), classRelationShip = listOf()
                    ) to FertStuecklistenzeileOut(
                        stueckNum = "",
                        versCode = "",
                        row = 0,
                        art = 0,
                        number = "",
                        beschreibung = "",
                        einheiten = "",
                        quant = 0.0f
                    )
                )
            )
        }
    }
}
)