package cn.kotlin

class Lambda {

}

fun plus(int: Int): String {
    return ""
}

val p = ::plus

fun test(hh: (Int) -> String) {

}

fun main() {
    test(::plus)
}