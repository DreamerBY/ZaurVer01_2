package lesson22_hw_2;

// Создайте класс Cat, который является child классом класса Pet.
// При вызове его конструктора с параметром, который будет передавать имя,
// пусть на экран выводится "I am cat and my name is: " + имя питомца.
// В класс добавьте метод sleep (выводящий на экран "Cat sleeps").
// Создайте класс Test, в методе main которого выведите на экран количество лап объекта класса Dog
// и вызовите метод sleep объекта класса Cat.


public class Cat extends Pet{
    public Cat(String name) {
       this.name = name;
        System.out.println("I am cat and my name is: " +name);
    }
    void sleep (){
        System.out.println("Cat sleeps");
    }
}
