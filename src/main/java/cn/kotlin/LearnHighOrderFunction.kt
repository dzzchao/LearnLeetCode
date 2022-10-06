package cn.kotlin

class LearnHighOrderFunction {

}

fun a(int: Int) {

}

fun b(int: Int) {

}

fun c(f: (int: Int) -> Unit) {

}

fun main() {
    c(::a)
}