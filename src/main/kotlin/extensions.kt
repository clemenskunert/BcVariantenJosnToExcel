package com.renner.actionnumbersave.framework

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.google.gson.reflect.TypeToken
import com.renner.actionnumbersave.framework.InternalGson.Companion.internalGson

const val timeAccuracyByMinutes: Int = 5

fun String.replaceWhitespaces(): String {
    return this.trim().replace("\\s".toRegex(), "")
}

inline fun <reified T> List<*>.asListOfType(): List<T> =
    if (all { it is T })
        @Suppress("UNCHECKED_CAST")
        this as List<T> else
        throw TypeCastException("Is not a suitable Type to Cast.")

class InternalGson {
    companion object {
        val internalGson: Gson = GsonBuilder()
            .setPrettyPrinting()
            .create()
    }
}

fun <T> T.toJsonString(): String =
    internalGson.toJson(this)

inline fun <reified T> Gson.fromJson(json: String) = this.fromJson<T>(json, object : TypeToken<T>() {}.type)!!