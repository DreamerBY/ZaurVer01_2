package lesson27_exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test7 {
  public static void main(String[] args) {
    StringBuilder result = new StringBuilder();
    try {
      File f = new File("test8.txt");
      System.out.println("Объект файл создался");
      FileInputStream fis = new FileInputStream(f);
      System.out.println("СТРИМ создался");
      int counter = 0;
      while (true) {
        counter++;
        result.append(fis.read());
        System.out.println("Информация читается");
        if (counter == 3) {
          fis.close();
        }

      }

    } catch (FileNotFoundException e) {
      System.out.println("Exception 1");
    } catch (IOException e) {
      System.out.println("Exception 2");
    } finally { //ОЧИЩАЮЩИЙ КОД. FINALLY ВСЕГДА БУДЕТ СРОБАТЫВАТЬ
      System.out.println("Eto finally");
    }
  }

}
