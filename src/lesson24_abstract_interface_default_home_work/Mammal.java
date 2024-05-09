package lesson24_abstract_interface_default_home_work;

abstract public class Mammal extends Animal implements Speakable{
    public Mammal(String name) {
        super(name);
        this.name = name;
    }
    abstract void run();
}
