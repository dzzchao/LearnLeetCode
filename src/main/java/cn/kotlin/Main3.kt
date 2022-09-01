package cn.kotlin


fun main() {

}
class FSF() {

}


fun test(call: () -> Unit) {
    call.invoke()
}

class Main3 constructor(
    val name: String
) {

    constructor() : this("sdf") {
        println("second constructor")
    }

    init {
        println("init")
    }

}
