package cn.java;

public class StringTest {

    public static void main(java.lang.String[] args) {
        java.lang.String a = "abc";
        java.lang.String b = new java.lang.String("abc");
        java.lang.String c = b.intern();
        System.out.println(a == c);

        String zifu = "中文";
        System.out.println(zifu.length());
    }
}

