package lesson27_exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class Test4 {

  public static void main(String[] args) {
    Test4 t = new Test4();
    try {
      t.def();
    } catch (FileNotFoundException e) {
      IOException f =e;

      System.out.println("Eception poyman");
      //e.printStackTrace();
      //System.out.println(e);
      System.out.println(e.getMessage());
    }



  }

  void abc() throws FileNotFoundException {
    File f = new File("test8.txt");
    FileInputStream fis = new FileInputStream(f);

    System.out.println("Good day all");

  }

  void def() throws FileNotFoundException {
    abc();
  }
}

