package cn.kotlin

class LearnInfix {
    infix fun love(str: String) {
        println("love$str")
    }
}

infix fun String.love(int: Int): String {
    return this + int.toString()
}

fun main() {
    LearnInfix() love "小芳"
    LearnInfix().love("小芳")
    val str = "我" love 3
    println(str)
}