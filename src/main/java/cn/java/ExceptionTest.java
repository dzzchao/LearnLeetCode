package cn.java;

import java.util.ArrayList;

public class ExceptionTest {
    public static void main(String[] args) {
        System.out.println(ex());
    }

    public static int ex() {
        try {
            ArrayList<String> list = null;
            list.add("1");
            System.out.println("try");
            return 1;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("catch");
            return 2;
        } finally {
            System.out.println("finally");
            return 3;
        }
    }
}
