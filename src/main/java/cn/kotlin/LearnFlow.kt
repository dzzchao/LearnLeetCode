package cn.kotlin

import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.map

class LearnFlow {
}

suspend fun main() {
    flow {
        for (i in 1..10) {
            println("emit-start")
            emit(i)
            println("emit-end")
        }
    }.map {
        it + 1
    }.collect {
        println("collect-start")
        println("-->$it")
        println("collect-end")
    }
}