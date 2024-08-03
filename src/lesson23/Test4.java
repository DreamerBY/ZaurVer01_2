package lesson23;

public class Test4 {
    void abc(Animal1 a) {                  //OVERLOADED
        System.out.println("A");
    }

    void abc(Mouse1 a) {                   //OVERLOADED
        System.out.println("M");
    }

    public static void main(String[] args) {
        Test4 t1 = new Test4();
        Animal1 an1 = new Mouse1();

        t1.abc(an1);
       an1.getName();
    }
}

class Animal1 {
    void getName() {
        System.out.println("Animal");
    }
}


class Mouse1 extends Animal1 {
    void getName() {
        System.out.println("Mouse");
    }
}
