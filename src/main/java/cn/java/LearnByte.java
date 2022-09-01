package cn.java;

public class LearnByte {
    public static void main(String[] args) {

        byte a = 127;
        byte b = 127;
//        b = a + b; // error : cannot convert from int to byte
        b += a; // ok

        long la = a;

        System.out.println(3*0.1 == 0.3);
    }
}
