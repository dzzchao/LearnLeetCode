package cn.kotlin

fun main() {
    taaa()
}

var num = 1;

fun taaa() {
    if(num == 3) {
        return
    }
    num++
    tbbb()
}

fun tbbb() {
    tccc()
}

fun tccc() {
    taaa()
}
