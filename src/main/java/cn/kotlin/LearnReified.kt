package cn.kotlin


//fun main() {
//    println(123.toType<String>())
//}

inline fun <reified T> Int.toType(): T? {
    return (this as? T)
}





