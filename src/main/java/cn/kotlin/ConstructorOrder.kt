package cn.kotlin

class ConstructorOrder constructor(val name: String) {




    constructor() : this("asdf") {
        println("second constructor")
    }

    init {
        println("init $name")
    }
}

fun main() {
    ConstructorOrder()
}