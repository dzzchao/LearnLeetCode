package cn.kotlin.coroutinue

import kotlinx.coroutines.delay
import kotlin.coroutines.*

class LogInterceptor : ContinuationInterceptor {
    override val key = ContinuationInterceptor

    override fun <T> interceptContinuation(continuation: Continuation<T>) = LogContinuation(continuation)
}

class LogContinuation<T>(private val continuation: Continuation<T>) : Continuation<T> by continuation {
    override fun resumeWith(result: Result<T>) {
        println("before resumeWith: $result")
        continuation.resumeWith(result)
        println("after resumeWith.")
    }
}


fun main() {

    suspend {
        println("send")
        1
    }.startCoroutine(object : Continuation<Int> {
        override val context: CoroutineContext
            get() = LogInterceptor()

        override fun resumeWith(result: Result<Int>) {
            println("receive ${result.getOrNull()}")
        }
    })


}