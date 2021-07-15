package com.renner.actionnumbersave.framework.data.input

data class ClassInput(
    val code: String,
    val description: String,
    val attributes: List<AttributeInput>,
    val children: List<ClassInput>,
)

