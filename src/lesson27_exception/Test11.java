package lesson27_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test11 {
  FileInputStream fis1;
  FileInputStream fis2;

  public void abc() {
    try {
      fis1 = new FileInputStream("test9.txt");
      try {
        fis2 = new FileInputStream("test10.txt");
      } catch (FileNotFoundException e) {
        System.out.println("file test 10 ne najden");
      }

    } catch (FileNotFoundException e) {
      System.out.println("file test 9 ne najden");
    } finally {
      System.out.println("Eto vneshnij finally block");
      try {
        fis1.close();
        fis2.close();
      } catch (IOException e) {
        System.out.println("Najdeno iskluchenie v finale blocke");
      }
    }
  }

  public static void main(String[] args) {
    Test11 t = new Test11();
    t.abc();

  }
}
