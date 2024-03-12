package lesson16_string1;

public class Test4 {
}

class Empolyee {
    double salary;
    boolean isManager;

    Empolyee(double salary, boolean isManager) {
        this.salary = salary;
        this.isManager = isManager;
    }
}
class TestEmployee{
    public static void main(String[] args) {
        Empolyee emp = new Empolyee(100.5,true);
        System.out.println("on meneger - "+ emp.isManager + " Ego zarplata - " +emp.salary);
    }
}