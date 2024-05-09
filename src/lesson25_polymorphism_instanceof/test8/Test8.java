package lesson25_polymorphism_instanceof.test8;

interface interface1 {
  int a = 5;

  void abc();
}

interface interface2 {
  int a = 10;

  void abc();
}

public class Test8 {

}

class Test1 implements interface1, interface2 {
  public static void main(String[] args) {
    Test1 t = new Test1();
    System.out.println(((interface2) t).a);
//    ( (interface1) t).abc();
    t.abc();
  }

  public void abc() {
    System.out.println("OK");
  }
}