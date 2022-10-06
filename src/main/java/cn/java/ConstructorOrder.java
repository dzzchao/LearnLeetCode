package cn.java;

public class ConstructorOrder {

    {
        System.out.println("blank code");
    }

    static {
        System.out.println("static blank code");
    }

    public ConstructorOrder() {
        System.out.println("constructor");
    }

    public static void main(String[] args) {
        new ConstructorOrder();
    }
}
