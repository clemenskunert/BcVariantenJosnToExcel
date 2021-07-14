package data.domain.input

data class ClassInput(
    val code: String,
    val description: String,
    val attributes: List<AttributeInput>,
    val decisions: List<DecisionIn>,
    val children: List<ClassInput>,
)

data class AttributeInput(
    val code: String,
    val description: String,
    val standardValue: String,
    val art: Int,
    val dataType: Int,
    val nullAble: Boolean,
    val decimal: Int? = 0,
    val rangeStart: Float? = 0f,
    val rangeEnd: Float? = 0f,
    val step: Float? = 0f,
    val expressions: List<GlobalExpression>? = null
)

data class DecisionBlock(
    val code: String,
    val attributeCode: String,
    val globalExpressionCode: String? = null,
    val numberValuePair: Pair<Float, Float?>? = null
)

data class GlobalExpression(
    val code: String,
    val expression: String,
    val description: String,
    val numberValue: Float? = 0f
)

data class DecisionIn(
    val decisionBlock: List<DecisionBlock>,
    val oldPartNumber: String
)
