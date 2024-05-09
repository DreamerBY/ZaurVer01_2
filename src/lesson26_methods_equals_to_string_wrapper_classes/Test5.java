package lesson26_methods_equals_to_string_wrapper_classes;

public class Test5 {

  {
    System.out.println("ETO INIT BLOCK 3");
  }


  Test5(){
    System.out.println("Eto konstruktor 1");
  }
  Test5(int a){
    this();
    System.out.println("Eto konstruktor 2");
  }




  {
    System.out.println("ETO INIT BLOCK 1");
  }
static
  {
    System.out.println("ETO INIT STATIC BLOCK 1");
  }


  {
    System.out.println("ETO INIT BLOCK 2");
  }


  static
  {
    System.out.println("ETO INIT STATIC BLOCK 2");
  }

  public static void main(String[] args) {
    Test5 test = new Test5();
    Test5 test1 = new Test5(3);
  }
}
