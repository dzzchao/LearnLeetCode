package cn.java;

public class LearnInteger {
    public static void main(String[] args) {
        Integer a = 10; // 装箱
        int b = a; // 拆箱

        int c = Integer.valueOf(100);

        Integer c1 = 127;
        Integer c2 = 127;
        System.out.println(c1 == c2);
    }
}
