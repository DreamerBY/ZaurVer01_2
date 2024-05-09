package lesson24_abstract_interface_default;

public class Test1 {

}

class A {
    String s = "Privet";

    void abc() {
        System.out.println("????");
    }
}

class B extends A {
    String s = "poka";

    void abc() {
        System.out.println("!!!");
    }
}

class C extends B {
    public static void main(String[] args) {
        C c = new C();
        c.abc();
        System.out.println(c.s);
    }
}
