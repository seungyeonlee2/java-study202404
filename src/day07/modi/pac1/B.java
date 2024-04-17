package day07.modi.pac1;

import day04.Dancer;
import day07.modi.pac2.C;

// class에는 public, protected사용 x
// 나머지는 사용 가능
// class에서 퍼블릭을 빼면 안쪽에 퍼블릭도 사용x
 class B {

     public int z1;
     int z2;
     private int z3;


    void test() {

        A a1 = new A(50); // public
        new A(5.55); // default
//        new A(true); // private

        a1.f1 = 20; // public
        a1.f2 = 50; // default
//        a1.f3 = 500; // private

        a1.m1();
        a1.m2();
//        a1.m3(); // private

        C c = new C();
        c.y1 = 10;
//        c.y2 = 20;
//        c.y3 = 30;

        Dancer dancer = new Dancer();
        dancer.dance();
    }
}
