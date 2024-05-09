package lesson26_methods_equals_to_string_wrapper_classes;

public class Test6 {
//  int a = 3;
//
//  {
//    a = 5;
//  }
//
//  Test6() {
//    a = 4;
//  }

//  public static void main(String[] args) {
//    Test6 t = new Test6();
//    System.out.println(t.a);
//  }


//  class A {
//     static final int b;
//      int a =5;
//
//      static {
//
//      a = 10; b=10;
//    }

  // }

//  class B {
//    static int c;
//    static final  int d;
//    static final  int e = 1;
//    static final  int f;
//
//    static {
//      c=5;
//      d=3;
//
//       f=0;
//    }
//
}


class C {
  static int i = 0;

  static {
    System.out.println(i);
  }

    {
    i = i + 1;
    System.out.println(i);
  }

  String s = "ok";

  {
    System.out.println(s);
  }

  C() {
    System.out.println("Eto konstruktor");
  }

  public static void main(String[] args) {
    System.out.println("Privet vsem");
    C c = new C();
  }
}

class D {

  static {
    abc(2);
  }
  static void abc(int a) {
    System.out.println(a+" ");
  }

  D(){abc(5);}
  static {
    abc(4);
  }
  {
    abc(6);
  }
  static {
    new D();
  }
  {
    abc(8);
  }

  public static void main(String[] args) {

  }



}

