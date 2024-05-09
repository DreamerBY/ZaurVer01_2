package lesson25_polymorphism_instanceof;

interface Help_able {
  void help();
}

public class Test3 {
  public static void main(String[] args) {
    Help_able h = new Doctor();
    Employee emp = new Doctor();
    Employee emp2 = new Teacher();
    Employee emp3 = new Driver();
    Employee e = new Employee();
    Test3 t = new Test3();
    h.help();
    //System.out.println(e==t);




    // Doctor d1 = (Doctor)  emp1;
    //System.out.println(((Doctor)h).specialiazaciya);
   // ((Doctor)h).lechit();

   // Driver d = (Driver) emp2;
    ((Doctor)emp).help();
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
  String nazvanieMashinu;

  void vodit() {
    System.out.println("Vodit");
  }
}