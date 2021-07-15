package com.renner.actionnumbersave.framework.data.domain.input

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