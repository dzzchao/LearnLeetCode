package cn.java;

import java.util.ArrayList;
import java.util.List;

/**
 * PECS
 *
 * 范性通配符
 */
public class GenericsTest {
    public static void main(String[] args) {
        List<Son> sonList = new ArrayList<>();
        sonList.add(new Son("123"));
        sonList.add(new Son("123"));
        sonList.add(new Son("123"));
        inputListFather(sonList);


        List<Father> fatherList = new ArrayList<>();
        fatherList.add(new Father("123"));
        fatherList.add(new Father( "123"));
        fatherList.add(new Father("123"));
        inputListSon(fatherList);


    }

    public static void inputListFather(List<? extends Father> list) {
//        list.add(new Father("sdfa")); //报错
//        list.add(new Son("sdfa")); //报错
        //只可以使用，不可以修改
        Father father = list.get(0);
//        Son son = list.get(0); //报错
        System.out.println(list.toString());
    }

    public static void inputListSon(List<? super Son> list) {
        list.add(new Son("3")); //可以
//        Son son = list.get(0);//报错
//        Father father = list.get(0);//报错
        System.out.println(list.toString());
    }
}


class Girl extends Father {
    String self;

    public Girl(String str) {
        super(str);
        self = str;
    }

    @Override
    public String toString() {
        return self;
    }
}


class Son extends Father {
    String self;

    public Son(String str) {
        super(str);
        self = str;
    }

    @Override
    public String toString() {
        return self;
    }
}

class Father {
    String self;

    public Father(String str) {
        self = str;
    }
}
