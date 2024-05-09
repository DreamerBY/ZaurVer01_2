package lesson24_abstract_interface_default_home_work;

public interface Speakable {
    default void speak () {
        System.out.println("Somebody speaks");
    }
}
