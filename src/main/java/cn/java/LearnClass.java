package cn.java;

public class LearnClass {
    {
        System.out.println("code block");
    }

    static {
        System.out.println("static block");
    }

    public LearnClass() {
        System.out.println("constructor block");
    }

    public static void main(String[] args) {
//        System.out.println(LearnClass.class);
        new LearnClass();
    }
}
