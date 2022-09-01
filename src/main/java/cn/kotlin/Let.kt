package cn.kotlin

import kotlin.contracts.ExperimentalContracts
import kotlin.contracts.contract

inline fun <T, R> T.letX(block: (T) -> R): R {
    return block(this)
}

fun main1() {
    val a = 2
    val intArray = IntArray(3)
    intArray.forEach {
        println("asdf $it")
    }
    a.let {

    }
    a.also {

    }

    a.apply {

    }
    a.run {

    }

    with(a) {

    }


    val target = getString()
    if (target.isAvailable()) {
        val result: String = target
    }
}

fun getString(): String? {
    TODO()
}

@OptIn(ExperimentalContracts::class)
fun String?.isAvailable(): Boolean {
    contract {
        returns(true) implies (this@isAvailable != null)
    }
    return this != null && this.length > 0
}
