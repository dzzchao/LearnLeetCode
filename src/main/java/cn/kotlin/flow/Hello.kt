package cn.kotlin.flow

import cn.kotlin.coroutinue.launchContinue
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.single
import kotlinx.coroutines.launch

suspend fun main() {
    val scope = MainScope()
    scope.launch(Dispatchers.IO) {
        launch {
            println("111111")
            val b = 2 / 0
        }
        launch {
            println("222222")
        }
    }
    delay(3000)
}