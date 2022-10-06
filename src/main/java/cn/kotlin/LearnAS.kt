package cn.kotlin

interface Animal{}
class People: Animal{}
class Dog

fun main() {
    val p = Dog()
    val an = p as? Animal
    val an2 = p as Animal?
}