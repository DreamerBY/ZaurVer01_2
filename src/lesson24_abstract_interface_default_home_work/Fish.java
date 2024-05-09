package lesson24_abstract_interface_default_home_work;

abstract public class Fish extends Animal{
    public Fish (String name) {
        super(name);
        this.name = name;
    }

    abstract void swim();

    void sleep(){
        System.out.println("Vsegda interesno nablyudat, kak spyat ribi");
    };
}
