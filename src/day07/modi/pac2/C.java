package day07.modi.pac2;

import day07.modi.pac1.A;
//import day07.modi.pac1.B;

public class C {
    // C입장에서 A,B는 다른학교

    public int y1;
    int y2;
    private int y3;

    void test() {

        // 패키지가 다르면 퍼블릭이여도 import해야함, 그래야 사용가능 (무조건)
        A a = new A(100); //public
//        new A(3.14); // default
//        new A(false); // private

        a.f1 = 10; //public
//        a.f2 = 20;
//        a.f3 = 30;

//        new B();

    }
}
