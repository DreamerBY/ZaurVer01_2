package lesson25_polymorphism_instanceof.test3;


interface Help_able {
  public void help();

}

public class Test3_1 {
  public static void main(String[] args) {

    Employee emp1 = new Doctor();
    Employee emp2 = new Teacher();
    Employee emp3 = new Driver();
    Employee emp4 = new Employee();
    Employee[] array = {emp1, emp2, emp3, emp4};
    for (Employee e : array) {
      if (e instanceof Driver) {
        System.out.println(((Driver) e).nazvanieMashinu);
        ((Driver) e).vodit();
      }

    }


  }
}

class Employee extends java.lang.Object {
  double salary = 100;
  String name = "Kolya";
  int age;
  int experience;

  void eat() {
    System.out.println("Kushatj");
  }

  void sleep() {
    System.out.println("Spat");
  }
}

class Doctor extends Employee implements Help_able {
  String specialiazaciya = "xirurg";

  public void help() {
    System.out.println("Доктор оказывает помощь");
  }

  void lechit() {
    System.out.println("Lechit");
  }
}

class Teacher extends Employee {
  int kolichestvouchenikov;

  void uchit() {
    System.out.println("Uchit");
  }
}

class Driver extends Employee {
  String nazvanieMashinu = "Mercedes";

  void vodit() {
    System.out.println("Vodit");
  }
}