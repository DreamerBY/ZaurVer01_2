package lesson30_lambda_hw;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;


public class TestEmployee {

   void printEmployee (Employee emp){
       System.out.println(emp.name + " " + emp.salary + " " + emp.department);
   }

   void filtraciyaRabotnikov (ArrayList<Employee> aL, Predicate <Employee> e){
       for (Employee emp : aL) {
           if (e.test(emp)) {
               printEmployee (emp);
           }
       }
   }
    public static void main(String[] args) {
        ArrayList <Employee> listEmployees = new ArrayList<>();
        Employee employee1 = new Employee("Sasha", "IT", 15000);
        Employee employee2 = new Employee("Elena", "KGB", 250);
        Employee employee3 = new Employee("DOCTOR", "DOCTOR", 3500);
        listEmployees.add(employee1);
        listEmployees.add(employee2);
        listEmployees.add(employee3);


        TestEmployee testEmployee = new TestEmployee();
        testEmployee.filtraciyaRabotnikov(listEmployees, (employee -> employee.department == "IT" && employee.salary >200) );
        System.out.println("=====");
        testEmployee.filtraciyaRabotnikov (listEmployees, (employee -> {return employee.name.startsWith("E") &&  employee.salary!=450;}));
        System.out.println("=====");
        testEmployee.filtraciyaRabotnikov(listEmployees, (employee -> employee.department == employee.name));

    }
}
