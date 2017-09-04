package com.droidacid.apticalc.utils

/**
 * Created by shivam on 4/9/17.
 */

fun fact(x: Int): Int {
    tailrec fun factTail(y: Int, z: Int): Int {
        if (y == 0) return z
        else return factTail(y - 1, y * z)
    }
    return factTail(x, 1)
}