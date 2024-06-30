package lesson27_exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test6 {
  public static void main(String[] args) {
    try {
      File f = new File("test8.txt");
      FileInputStream fis = new FileInputStream(f);
    } catch (FileNotFoundException e) {
      System.out.println("POYMAN EXCEPTION 1");
    } catch (NullPointerException e) {
      System.out.println("POYMAN EXCEPTION 2");
    } catch (IOException e) {
      System.out.println("POYMAN EXCEPTION 3");
    } catch (RuntimeException e) {
      System.out.println("POYMAN EXCEPTION 4");
    }
    catch(Exception e){
      System.out.println("POYMAN EXCEPTION 5");
    }
    catch(Throwable e){
      System.out.println("POYMAN EXCEPTION 6");
    }


  }

}
