package lesson27_exception;
import java.util.*;

public class Test16 {
   static ArrayList <String> list = new ArrayList<>();
   static Doctor[] array = new Doctor[4];
  public static void main(String[] args) {
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
//createPassword("qwукенмивапвапвап");
 //   list.add("!!!");
 //   System.out.println(array[0].toString());
    Integer.parseInt("44ab",16);

  }

  //LinkageError
  public static void createPassword(String pwd){
    if(pwd.length()<6){
      throw new IllegalArgumentException("Длина пароля слишком коротуая");
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

//class Samolet{
//  String sostoyanie = "v ogidabii";//v ogidabii, v vozduhe, polet otmenen
//  public void letet(){
//    sostoyanie = "v vozduhe";
//    System.out.println("Samolet letit");
//  }
//
//  public void ogidatj(){
//    if (sostoyanie.equals("v vozduhe")){
//      throw new IllegalStateException("Samolet uge v vozduhe");
//    }
//    sostoyanie = "v ogidabii";
//    System.out.println("Самолет в ожидании полета");
//  }
//
//  public void otmenitjPolet(){
//    if (sostoyanie.equals("v vozduhe")){
//      throw new IllegalStateException("Samolet uge v vozduhe");
//    }
//    sostoyanie = "polet otmenen";
//    System.out.println("Полет самолета отменен");
//  }
//
//  public static void main(String[] args) {
//    Samolet s = new Samolet();
//    s.ogidatj();
//    s.letet();
//    s.otmenitjPolet();
//  }
//}