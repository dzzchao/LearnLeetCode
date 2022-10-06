package cn.kotlin

open class IsFather {

}

class IsSon : IsFather() {

}

fun main() {
    val son = IsSon()
    if (son is IsFather) {
        println("is Father")
    } else if (son is IsSon) {
        println("is son")
    }
}