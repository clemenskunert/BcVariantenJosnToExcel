package com.renner.actionnumbersave.framework.data.domain.input

data class GlobalExpression(
    val code: String,
    val expression: String,
    val description: String,
    val numberStart: Float? = 0f,
    val numberEnd: Float? = 0f,
    val partNumber: String? = "",
)