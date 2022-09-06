package cn.java;

class LearnInterface {
    public static int count = 2;
    static LearnInterface face = new LearnInterface();

    public LearnInterface() {
        System.out.println("构造方法 ");
        count++;
    }

    public static void main(StringTest[] args) {
        System.out.println(LearnInterface.count);
    }
}
