package lesson24_abstract_interface_default.interface9;

public class Test {
}


interface I1 {
    private static void method1() {
        System.out.println("static merhod");
    }

    private void method2() {
        System.out.println("non-static merhod");
    }

    default void method3() {
        method1();
        method2();
    }

    static void method4() {
        method1();
        //method2(); // - private non-static метод HE может быть использован внутри private static методов
    }

}