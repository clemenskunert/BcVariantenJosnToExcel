import com.renner.actionnumbersave.framework.toJsonString
import data.domain.input.*
import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.gherkin.Feature

object JsonClassParser : Spek({
    Feature("Parse Json to ClassInput Object") {
        Scenario("create class object and parse to json String") {
            val firstTest = ClassInput(
                code = "FLUEDAEMARM",
                description = "Flügel Dämpferarm",
                attributes = listOf(
                    AttributeInput(
                        code = "LOEFFUEBERSTAND",
                        description = "Löffelüberstand",
                        standardValue = "19",
                        art = 2,
                        dataType = 0,
                        nullAble = false,
                        decimal = 0,
                        rangeStart = 15f,
                        rangeEnd = 30f,
                        step = 1f,
                    ),
                    AttributeInput(
                        code = "DAEARMSORT",
                        description = "Dämpferarmesorte",
                        standardValue = "",
                        art = 1,
                        dataType = 1,
                        nullAble = false,
                        expressions = listOf(
                            GlobalExpression(
                                code = "",
                                expression = "Renner_2_Bl.10",
                                description = "",
                            ),
                            GlobalExpression(
                                code = "",
                                expression = "Renner_Schr.2 Bl.10",
                                description = "",
                            ),
                            GlobalExpression(
                                code = "",
                                expression = "Renner_Schr.1 Bl.10",
                                description = "",
                            )
                        )
                    )
                ),
                decisions = listOf(
                    DecisionIn(
                        decisionBlock = listOf(
                            DecisionBlock(
                                code = "",
                                attributeCode = "",
                                numberValuePair = 14f to 17f
                            )
                        ), oldPartNumber = "995611094"
                    )
                ),
                children = listOf(
                    ClassInput(
                        code = "",
                        description = "",
                        attributes = listOf(),
                        decisions = listOf(),
                        children = listOf(),
                    )
                )
            )
            Then("Print Json") {
                println(firstTest.toJsonString())
            }
        }
    }
})