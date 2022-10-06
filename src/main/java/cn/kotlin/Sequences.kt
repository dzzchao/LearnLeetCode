package cn.kotlin

import kotlinx.coroutines.job
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main(): Unit = runBlocking {

    val job = launch {

        generateSequence(1) {
            it + 1
        }.take(20).map {
            println("it$it")
        }.forEach {
        }
    }

    job.join()

}