package lesson23;

public class Test3 {
    public static void main(String[] args) {
        Employee e = new Teacher();
        e.eat();
    }


}

class Eda {
}

class Fruit extends Eda {
}


//class Employee {
//
//    double salary = 100;
//    String name = "Kolya";
//    int age;
//    int experience;
//    int a = 5;
//
//    Eda eat() {
//        System.out.println("Kushaet rabotnik");
//        Eda e = new Eda();
//        return e;
//    }
//
//    void sleep() {
//        System.out.println("Spat");
//    }
//}

//class Teacher extends Employee {
//
//
//    Eda eat() {
//        System.out.println("Kushaet U4itel");
//        Fruit f = new Fruit();
//        return f;
//    }
//
//    int kolichestvoUchenikov;
//
//    void uchit() {
//        System.out.println("Uchit");
//    }
//}
//
//
//class A {
//    Employee objectCreation() {
//        return new Employee();
//    }
//}
//
//class B extends A {
//    H objectCreation() {
//        System.out.println("OK");
//        return new  H();
//    }
//}
//class H extends Teacher{
//
//}