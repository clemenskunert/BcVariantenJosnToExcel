package data.domain.input

data class ClassInput(
    val code: String,
    val description: String,
    val attributes: List<AttributeInput>,
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

data class GlobalExpression(
    val code: String,
    val expression: String,
    val description: String,
    val numberStart: Float? = 0f,
    val numberEnd: Float? = 0f,
    val partNumber: String? = "",
)

