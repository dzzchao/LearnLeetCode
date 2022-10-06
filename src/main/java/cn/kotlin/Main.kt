package cn.kotlin

fun main() {
    a()
    a()
}
fun a() {
    val runnable = Runnable {
        println("asdf")
    }
    b(runnable)
}
var set = mutableSetOf<Runnable>()
fun b(r: Runnable) {
    set.add(r)
    println(set.size)
}