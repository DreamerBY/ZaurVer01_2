package lesson24_abstract_interface_default;

public class Test3 {
    public static void main(String[] args) {
        Help_able h = new Driver();
        Help_able s = new Driver();
        Employee e = new Driver();
        System.out.println(h.a);
        h.pomosh();
        h.tushitPojar("voda");
       // h.eat;


    }


}


class Employee {
    String name;
    int age;
    int experience;

    void eat() {
        System.out.println("Kushatj");
    }

    void sleep() {
        System.out.println("Spat");
    }
}

class Driver extends Employee implements Help_able, Swim_able{
    String nazvanieMashinu;

    void vodit() {
        System.out.println("Vodit");
    }


    public void pomosh(){
        System.out.println("Voditel okazuvaet pomosh");
    };
    public void tushitPojar(String s){
        System.out.println("Voditel tushit pojar with help" + s);
    };
    public void swim(){System.out.println("Voditel swim");
    }
}



class Teacher extends Employee implements Help_able{
    int kolichestvouchenikov;
    void uchit() {
        System.out.println("Uchit");
    }
    public void pomosh(){
        System.out.println("Uchitel okazuvaet pomosh");
    };
    public void tushitPojar(String s){
        System.out.println("Teacher тушит пожар с помощью" + s);
    };

}



interface Help_able{
    public void pomosh();
    public void tushitPojar(String predmet);
    int a = 10;
}
interface Swim_able{
    public void swim();

}
abstract class Y implements Swim_able{}
abstract class X extends Y{}
class Z extends Y {
    public void swim () {

    }
}






