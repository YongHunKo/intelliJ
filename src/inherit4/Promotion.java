package inherit4;

class A {}

class B extends A{}

class C extends A{}

class D extends B{}

class E extends B{}

class F extends C{}

public class Promotion{
    public static void main(String[] args) {
        B b = (B)new A();// 이게 왜 될까

    }
}