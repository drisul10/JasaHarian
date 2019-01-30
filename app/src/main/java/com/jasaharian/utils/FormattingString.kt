package com.jasaharian.utils

fun String.toCapitalFirst() = when {
    length < 2 -> toUpperCase()
    else -> this[0].toUpperCase() + substring(1).toLowerCase()
}