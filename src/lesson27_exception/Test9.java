package lesson27_exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test9 {
  static void abc() throws FileNotFoundException {
    try {
      File f = new File("test9.txt");
      FileInputStream fis = new FileInputStream(f);
    } catch (FileNotFoundException e) {
      System.out.println("Exception poyman i nemnogo obrabotan");
      throw e;
    } finally {
      System.out.println("eto block finally");
    }
  }


  void method() throws FileNotFoundException{
    try {
      abc();
    } catch (FileNotFoundException e) {
      System.out.println("Exception poyman i POLNOSTYU obrabotan ");
    }
  }

//  static void def()   {
//    try {
//      int[] array = {1, 2, 3};
//      System.out.println(array[5]);
//    } catch (ArrayIndexOutOfBoundsException e) {
//      System.out.println("Exception poyman i nemnogo obrabotan");
//      throw e;
//    } finally {
//      System.out.println("eto block finally");
//    }
//  }

}



