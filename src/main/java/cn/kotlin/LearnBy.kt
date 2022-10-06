package cn.kotlin

class LearnBy {

    val aa by lazy(mode = LazyThreadSafetyMode.SYNCHRONIZED) {
        "1234"
    }

}

// 创建接口
interface Base {
    fun print()
}

// 实现此接口的被委托的类
class BaseImpl(val x: Int) : Base {
    override fun print() { print(x) }
}

// 通过关键字 by 建立委托类
class Derived(b: Base) : Base by b

fun main() {
    val a = LearnBy().apply {
        aa
    }
    val b = BaseImpl(10)
    Derived(b).print() // 输出 10
}


