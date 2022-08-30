package cn.java;

import java.security.Security;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        String a = "abc";
        String b = new String("abc");
        String c = b.intern();
        System.out.println(a == c);
    }
}

