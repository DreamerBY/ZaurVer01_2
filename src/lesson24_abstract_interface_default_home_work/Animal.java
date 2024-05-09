package lesson24_abstract_interface_default_home_work;

abstract public class Animal {
    String name;
   public Animal(String name) {
      this.name = name;
    }

    abstract void eat();

    abstract void sleep();
}
