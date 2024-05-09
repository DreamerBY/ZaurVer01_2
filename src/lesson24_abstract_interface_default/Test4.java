package lesson24_abstract_interface_default;

public class Test4 {
    public static void main(String[] args) {
        Jumpable j1 = new Hyman();
        Jumpable j2 = new Animal();
    }
}
class Hyman implements Jumpable {
    public void jump(){
        System.out.println("Human Jumps");
    }
}

class Animal implements Jumpable {
    public void jump(){
        System.out.println("Animal Jumps");
    }
}

interface Jumpable{
    void jump();
}

interface A2{
    void abc();
}

interface B2 extends A2, Jumpable{
    void def();
}
abstract class D implements A2,B2{}







