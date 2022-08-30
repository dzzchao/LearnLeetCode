package cn.kotlin

import kotlin.reflect.KFunction

class Ext {

}

fun String.addhhh(int: Int) {
    println(this + "hhh" + int)
}

fun normal(str: String, int: Int) {
    println(str + int)
}

fun main() {
    val a: String.(Int) -> Unit = String::addhhh
    val b: (String, Int) -> Unit = String::addhhh
    val c = String::addhhh
    a.invoke("abc", 10)
    val d: String.(Int) -> Unit = ::normal
    "adf".d(23)
}
