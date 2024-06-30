package lesson27_exception;


import java.io.*;
public class Test14 {
  static FileInputStream fis1, fis2;

  public static void main(String[] args) {
    try{
      fis1 = new FileInputStream("Test19.txt");
      System.out.println("file test9 существует в системе и найден");
      try{
        fis2.close();
      }
      catch (IOException e){
        System.out.println("problemy so stream-om физ2");
      }
    }
    catch (FileNotFoundException e){
      System.out.println("file test9 ne nayden");
    }
    catch (NullPointerException e){
      System.out.println("Srabotal NullPointerException");
    }
  }
}
