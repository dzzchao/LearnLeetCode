package cn.kotlin


val rulesMap: Map<String, (String?) -> Boolean> = mapOf(
    "weak" to { it != null },
    "medium" to { !it.isNullOrBlank() },
    "strong" to { it != null && "^[a-zA-Z0-9]+$".toRegex().matches(it) }
)

fun main() {
    testA(object : AAA {
        override fun run(): Int {
            return 0
        }
    })
    testB {
        0
    }
}

fun testA(aa: AAA) {}
fun testB(bb: BBB) {}

interface AAA {
    fun run(): Int
}

fun interface BBB {
    fun run(): Int
}


