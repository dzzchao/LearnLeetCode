package cn.kotlin

import kotlin.concurrent.thread


//fun normal(postAction: () -> Unit) {
//    println("normal-hello")
//    postAction()
//}

inline fun inlineNormal(postAction: () -> Unit) {
    println("inline-hello")
    postAction()
}

inline fun noInlineNormal(preAction: () -> Unit, noinline postAction: () -> Unit) {
    println("noinline-hello")
    val b = postAction
}

inline fun crossInlineNormal(crossinline postAction: () -> Unit) {
    println("crossInline-hello")
    thread {
        postAction.invoke()
    }
}

fun main() {
    for (i in 1..10) {
        //普通高阶函数
//        normal {
//            println("normal-end")
//        }

        //inline函数
        inlineNormal {
            println("inline-end")
            return
        }

        //noinline
        noInlineNormal({
            return
        }) {
            println("noinline-end")
            return@noInlineNormal
        }

        //crossInLine
        crossInlineNormal {
            println("crossInline-end")
            return@crossInlineNormal
        }
    }
}
