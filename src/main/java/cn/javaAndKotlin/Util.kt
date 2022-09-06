package cn.javaAndKotlin

class Person() {
    @get:JvmName("xxx")
    var name: String = ""
}

fun a() {
    Person().name
}