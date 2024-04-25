package day08.protect.pac1;

public class A {

    protected int f1;
    int f2; // default (package-private, package-friendly)

    protected void m1() {}
    void m2() {}

    public A() {}
    protected A(int a) {}
    A(double b) {}


}
