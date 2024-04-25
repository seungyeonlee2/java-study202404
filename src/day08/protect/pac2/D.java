package day08.protect.pac2;

import  day08.protect.pac1.A;

public class D extends A {

    D() {
        super(100);

        super.f1 = 100;
//        super.f2 = 200;

        m1();
//        m2();

    }

    void test() {
//        A a = new A();
//        a.f1 = 10; a.f2 = 30;
//        a.m1(); a.m2();
    }
}
