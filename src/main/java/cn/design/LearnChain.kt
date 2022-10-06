package cn.design

fun main() {
    val list = mutableListOf<Intercept>()
    list.add(Intercept1())
    list.add(Intercept2())
    list.add(Intercept3())

    val chain = RealChain(list)
    chain.proceed()
}

interface Intercept {
    fun intercept(realChain: RealChain)
}

class RealChain(val list: MutableList<Intercept>) {
    var i = 0
    fun proceed() {
        if (i == list.size) {
            return
        }
        val intercept = list[i++]
        intercept.intercept(this)
    }
}

class Intercept1 : Intercept {
    override fun intercept(realChain: RealChain) {
        println("Intercept1 exec")
        realChain.proceed()
        println("Intercept1 over")
    }
}

class Intercept2 : Intercept {
    override fun intercept(realChain: RealChain) {
        println("Intercept2 exec")
        realChain.proceed()
        println("Intercept2 over")
    }
}
class Intercept3 : Intercept {
    override fun intercept(realChain: RealChain) {
        println("Intercept3 exec")
        realChain.proceed()
        println("Intercept3 over")
    }
}