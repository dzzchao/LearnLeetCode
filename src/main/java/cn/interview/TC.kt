package cn.interview

import java.util.Arrays

fun main() {
    val arr = arrayOf(1, 2, 3, 4, 5)
    //找出相加等于20的所有集合。
    arr.sortDescending()
    println(arr.contentToString())
    for (i in arr.indices) {
        val tempX = arr[i]
        for (j in arr.indices) {
            val tempY = arr[j]
            println("$tempX==$tempY")
        }
    }
}