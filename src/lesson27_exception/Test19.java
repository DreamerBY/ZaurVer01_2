package lesson27_exception;


import java.io.FileNotFoundException;
import java.io.IOException;

public class Test19 {
  public static void main(String[] args) {
   // Animal2 a = new Mouse();


  }

}

class Animal2 {
  Animal2() throws FileNotFoundException {

  }

}

class Mouse extends Animal2 {
  Mouse() throws FileNotFoundException {
    super();
  }

  ;

}

class Human {
  String name;
  int age;

  Human(String name, int age) throws Exception {
      if (age < 0) {
          throw new Exception("nekorrectniy vozrast");
      }
    this.name = name;
    this.age = age;
  }
}