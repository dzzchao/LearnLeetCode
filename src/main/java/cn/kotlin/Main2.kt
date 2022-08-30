package cn.kotlin

import kotlinx.coroutines.*
import kotlinx.coroutines.channels.BufferOverflow
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.flow.collect
import org.jetbrains.annotations.TestOnly



fun main2() = runBlocking {
    val sharedFlow = MutableSharedFlow<Int>(
        replay = 1,
        extraBufferCapacity = 0,
        onBufferOverflow = BufferOverflow.DROP_OLDEST
    )
    launch(Dispatchers.IO) {
        sharedFlow.asSharedFlow().collect {
            delay(2000)
            println("collect $it")
        }
    }
    launch {
        for (i in 1..10) {
            delay(1000)
            sharedFlow.emit(i)
            println("emit $i")
        }
        println("emit over")
    }
    println("end")
}

// intArray 是 int 还是 Integer
