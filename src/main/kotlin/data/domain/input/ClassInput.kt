package data.domain.input

import com.renner.actionnumbersave.framework.data.domain.input.AttributeInput

data class ClassInput(
    val code: String,
    val description: String,
    val attributes: List<AttributeInput>,
    val children: List<ClassInput>,
)

