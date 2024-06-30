package lesson27_exception;

public class Test5 {

  static void abc (){
    System.out.println("Rabotart mrthod abc");
    abc();
  }

  public static void main(String[] args) {
    try{abc();}
    catch(StackOverflowError e){System.out.println("ERROR POJMAN "+e);}

  }


}
