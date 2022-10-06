package cn.java;

class LearnInterface {
    public static void main(String[] args) {
        LearnInterface_T t = new LearnInterface_T();
        t.abstract1();
        t.inter1();
    }
}


interface MyInterFace {
    void inter1();

    void inter2();
}

abstract class MyAbstractClass implements MyInterFace {

    void abstract1() {
        System.out.println("F  abstract1");

    }

    void abstract2() {
        System.out.println("F  abstract2");
    }
}

class LearnInterface_T extends MyAbstractClass {

    @Override
    void abstract1() {
        super.abstract1();
        System.out.println("abstract1");
    }

    @Override
    public void inter1() {
        System.out.println("inter1");
    }

    @Override
    public void inter2() {
        System.out.println("inter2");
    }
}
