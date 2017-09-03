package com.droidacid.apticalc.utils

/**
 * Created by shivam on 3/9/17.
 */

fun String?.isEmpty(): Boolean {
    return this == null || this.isEmpty()
}

fun String?.isNotEmpty(): Boolean {
    return this != null && this.isNotEmpty()
}