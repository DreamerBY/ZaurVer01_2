package lesson26_methods_equals_to_string_wrapper_classes;

public class Test7 {
  public static void main(String[] args) {

  Lion l = new Lion();
  }
}


class Animal {
  static {
    System.out.println("Static init in Animal");
  }

  {
    System.out.println("non - static init in Animal");
  }

  Animal() {
    System.out.println("Animal constructor");
  }
}

class Mammal extends Animal {
  static {
    System.out.println("Static init in Mammal");
  }

  {
    System.out.println("non - static init in Mammal");
  }

  Mammal() {
    System.out.println("Mammal constructor");
  }
}

class Lion extends Mammal {
  Lion() {
    System.out.println("Lion constructor");
  }


  static {
    System.out.println("Static init in Lion");
  }

  {
    System.out.println("non - static init in Lion");
  }


}