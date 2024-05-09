package lesson25_polymorphism_instanceof;

public class NewClass {
}

class Car {
    static int a = 5;

    public static void main(String[] args) {
        Car c = new Car();
        System.out.println(c.a);
        c = null; // Наличие объекта не проверяется потому что static
        System.out.println(c.a);

    }
}