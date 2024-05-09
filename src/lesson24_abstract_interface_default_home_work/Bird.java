package lesson24_abstract_interface_default_home_work;

abstract public class Bird extends Animal implements Speakable{
    public Bird(String name) {
        super(name);
        this.name = name;
    }
    abstract void fly();


    public void speak () {
        System.out.println(name + " sings");
    }
}
