package cn.kotlin


fun main() {
    val sonList: ArrayList<Son> = ArrayList()
    sonList.add(Son("123"))
    sonList.add(Son("123"))
    sonList.add(Son("123"))
    inputListFather(sonList)


//    var fatherList: List<Father> = ArrayList()
//    fatherList.add(Father("123"))
//    fatherList.add(Father("123"))
//    fatherList.add(Father("123"))
//    cn.java.GenericsTest.inputListSon(fatherList)
}

fun inputListFather(sonList: java.util.ArrayList<out Father>) {

}


//internal class Girl(var self: String) : Father(self) {
//    override fun toString(): String {
//        return self
//    }
//}


class Son(override var self: String) : Father(self) {

}

open class Father(open var self: String)
