package cn.kotlin

class LearnPlus(var i: Int) {
    operator fun plus(p: LearnPlus): Int {
        return i + p.i
    }
}

fun main() {
    val result = LearnPlus(1) + LearnPlus(2)
    println(result)
}