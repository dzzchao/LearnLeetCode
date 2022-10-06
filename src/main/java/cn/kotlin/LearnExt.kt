package cn.kotlin

//扩展函数的作用域
object Ext {
    fun String.addhhh(int: Int) {
        println(this + "testhhh" + int)
    }
}

fun normal(str: String, int: Int) {
    println(str + int)
}


fun String.addhhh(int: Int) {
    println(this + "hhh" + int)
}

fun main() {
    var a: (str: String, int: Int) -> Unit = String::addhhh
    a.invoke("haha", 1234)
    a = ::normal
}

