package cn.kotlin

class ConstructorOrder
constructor(name: String) {
    constructor() : this("asdf") {
        println("second constructor")
    }
    init {
        println("init $name")
    }
    init {
        println("init 2")
    }
    init {
        println("init 3")
    }
}

fun main() {
    ConstructorOrder()
}