package lesson24_abstract_interface_default_home_work;

public class Lesson24 {
    public static void main(String[] args) {
        Mechenosec m1 = new Mechenosec("Kolya");
        System.out.println(m1.name);
        m1.sleep();
        m1.eat();
        m1.swim();

        System.out.println("***************************");

        Speakable p1 = new Pingvin("Petya");
        p1.speak();
        System.out.println("***************************");

        Animal l1 = new Lev("Olga");
        System.out.println(l1.name);
        l1.eat();
        l1.sleep();

        System.out.println("***************************");
        Mammal l2 = new Lev("Lenka");
        System.out.println(l2.name);
        l2.run();
        l2.eat();
        l2.sleep();
        l2.speak();





    }
}
