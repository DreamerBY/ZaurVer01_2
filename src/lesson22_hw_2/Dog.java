package lesson22_hw_2;

public class Dog extends Pet{
    public Dog(String name){
        this.name = name;
        System.out.println("I am dog and my name is: " +  name);

    }
    void play (){
        System.out.println("Dog plays");
    }
}
