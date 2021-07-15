package com.renner.actionnumbersave.framework.data.input

data class GlobalExpression(
    val code: String,
    val expression: String,
    val description: String,
    val numberStart: Float? = 0f,
    val numberEnd: Float? = 0f,
    val partNumber: Array<String>? = null,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as GlobalExpression

        if (code != other.code) return false
        if (expression != other.expression) return false
        if (description != other.description) return false
        if (numberStart != other.numberStart) return false
        if (numberEnd != other.numberEnd) return false
        if (partNumber != null) {
            if (other.partNumber == null) return false
            if (!partNumber.contentEquals(other.partNumber)) return false
        } else if (other.partNumber != null) return false

        return true
    }

    override fun hashCode(): Int {
        var result = code.hashCode()
        result = 31 * result + expression.hashCode()
        result = 31 * result + description.hashCode()
        result = 31 * result + (numberStart?.hashCode() ?: 0)
        result = 31 * result + (numberEnd?.hashCode() ?: 0)
        result = 31 * result + (partNumber?.contentHashCode() ?: 0)
        return result
    }
}