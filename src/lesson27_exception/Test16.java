package lesson27_exception;
import java.util.*;

public class Test16 {
  public static void main(String[] args) {
//    ArrayList <String> list = new ArrayList<>();
//    list .add("1");
//    list .add("2");
//    System.out.println(list.get(1));
//    System.out.println(5*2);
//    Doctor d= new Doctor();
//    Teacher t = new Teacher();
//    Teacher t3 = new Teacher();
//    Teacher [] array2 = {t,t3};
//    Employee [] array1 = {d,t};
   // Teacher t2 = (Teacher) array1[0];

//    Doctor d2 = (Doctor) array2[0];

createPassword("qw");

  }
  public static void createPassword(String pwd){
    if(pwd.length()<6){
      throw new IllegalArgumentException("Длинна пароля слишком коротуая");
    }
    if(pwd.length()>12){
      throw new IllegalArgumentException("Длинна пароля слишком большая");
      }
    System.out.println("Пароль принят");
  }
}
class Employee {}
class Doctor extends Employee{}
class Teacher extends Employee{}