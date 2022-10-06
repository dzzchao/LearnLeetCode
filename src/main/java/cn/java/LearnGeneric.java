package cn.java;

public class LearnGeneric {
    public static void main(String[] args) {

    }
}

//测试增加桥接方法

interface Animal<T>{
    void eat(T t);
}

class Cat implements Animal<String>{

    //会生成桥接方法
    @Override
    public void eat(String s) {

    }
}