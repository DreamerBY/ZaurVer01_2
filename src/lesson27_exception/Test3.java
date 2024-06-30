package lesson27_exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Test3 {
  public static void main(String[] args) throws Exception {
    File f = new File("test8.txt");
    FileInputStream fis = new FileInputStream(f);
   // System.out.println("файл найден");
     fis.read();
//    FileOutputStream fos = new FileOutputStream(f);
//    fos.write(100);









  }
}
