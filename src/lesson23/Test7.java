package lesson23;

public class Test7 {
    public static void main(String[] args) {
        A c1 = new C();
        c1.abc(new B());
    }
}

class A{
    void abc (A a){                            //Overloaded
        System.out.println("A");
    }
}

class B extends A{
    void abc (B b1){                            //Overloaded
        System.out.println("B");
    }
}

class C extends B{
    void abc (B b2){                             //Override
        System.out.println("C");
    }
}