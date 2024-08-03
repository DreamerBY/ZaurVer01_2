package lesson23;

public class Test5 {
  public static void main(String[] args) {
    Employee emp = new Employee();
    Teacher t = new Teacher();
    //emp.sleep();
  //  t.sleep();
    Employee e = new Teacher();
    e.sleep();
  }
}

class Employee {
  double salary = 100;
  String name = "Kolya";


  Eda eat() {
    System.out.println("Kushaet rabotnik");
    Eda e = new Eda();
    return e;
  }

  static void sleep() {
    System.out.println("Spit rabotnik");
  }
}

class Teacher extends Employee {

  @Override
  Eda eat() {
    System.out.println("Kushaet U4itel");
    Fruit f = new Fruit();
    return f;
  }

  int kolichestvoUchenikov;

  void uchit() {
    System.out.println("Uchit");
  }

  static void sleep() {
    System.out.println("Spit u4itel");
  }
}
//final class t{}
//class p extends t{}

