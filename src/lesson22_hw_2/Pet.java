package lesson22_hw_2;

public class Pet extends Animal {
    public Pet() {
        System.out.println("I am pet");
        eyes = 2;
    }


    String name;
    int tail = 1;
    int paw = 4;
    void run() {
        System.out.println("Pet runs");
    }
    void jump() {
        System.out.println("Pet jump");
    }


}

