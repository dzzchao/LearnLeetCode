package cn.kotlin

fun main() {
    for (i in 1..100) {
        //no inline
        helloNoInline(preCall = {
            println("precall invoke")
        }, call = {
            println("call invoke")
        })

        //cross inline
        hello {
            //only inline function can use return
//            return@hello
        }

        normalHello {
            return@normalHello //
        }
    }
}

fun normalHello(call:()->Unit) {
    println("normal")
}

inline fun hello(crossinline preCall: () -> Unit) {
    runOnUIThread {
        preCall.invoke()
        println("inline hello")
    }
}

fun runOnUIThread(call:()->Unit) {
    call.invoke()
}

inline fun helloNoInline(preCall: () -> Unit, noinline call: () -> Unit): () -> Unit {
    preCall.invoke()
    println("inline hello")
    call.invoke()
    return call
}
