package lesson27_exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test8 {


  public static void main(String[] args) {
    System.out.println(abc());


  }

  static StringBuilder abc() {
    StringBuilder a = new StringBuilder("Privet");
    try {

      File f = new File("test19.txt");
      System.out.println("obyekt File sozdalsya");
      FileInputStream fis = new FileInputStream(f);
      // return 5;
    } catch (FileNotFoundException e) {
      System.out.println("Exception occured");
      System.out.println("peremennaya a v catch bloke = " + a);
      return a;
    } finally {
      a.append("!!!");
      System.out.println("eto block finally");
      System.out.println("peremennaya a v FINALLY bloke = " + a);
      // return 7;
    }
    return a;

  }

}
