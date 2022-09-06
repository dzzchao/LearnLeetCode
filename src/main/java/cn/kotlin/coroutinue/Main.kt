package cn.kotlin.coroutinue

import kotlinx.coroutines.delay
import kotlin.coroutines.*



fun main() {



    val continuation = suspend {
        println("In Coroutine.")
        5
    }.createCoroutine(object : Continuation<Int> {
        override fun resumeWith(result: Result<Int>) {
            println("Coroutine End: $result")
        }
        override val context = EmptyCoroutineContext
    })

    continuation.resume(Unit)

    launchContinue(ProducerScope<Int>()) {
        produce(11)
        //delay(2222) // 因为有 @RestrictsSuspension ，所以不能使用
        produce(2222)
    }
}

@RestrictsSuspension
class ProducerScope<T> {
    suspend fun produce(value: T) {

    }
}


fun <R, T> launchContinue(receiver: R, block: suspend R.() -> T) {
    block.startCoroutine(receiver, object : Continuation<T> {
        override val context: CoroutineContext
            get() = EmptyCoroutineContext

        override fun resumeWith(result: Result<T>) {
            println("Coroutine End: $result")
        }
    })
}

