package lesson22_hw_1;


//    1. Создайте класс Student со следующими переменными: name (используйте StringBuilder), course, grade.
//    Примените инкапсуляцию к данному классу. Длина имени объектов не должна быть менее 3-х символов,
//    оценки должны быть числами в интервале от 1 до 10, курс должен быть числом от 1 до 4 включительно.
//    Создайте метод showInfo, который будет выводить всю информацию о студенте,
//    не используя переменные класса напрямую.
//    Создайте класс TestStudent, в котором создайте объект класса Student, придайте его переменным значения.
//    Произведите вызов метода showInfo.


public class Student {
    private StringBuilder name;
    private int course;
    private int grade;

    public StringBuilder getName() {
        StringBuilder name2 = new StringBuilder(name); // Important statement
        return name2;
    }

    public int getCourse()
    {
        return course;
    }

    public int geGrade()
    {
        return grade;
    }

    public void setName(StringBuilder name) {
        if (name.length() > 2) {
            this.name = name;

        } else {
            System.out.println("name error");
        }
    }

    public void setCourse(int course) {
        if (course > 0 && course < 5) {
            this.course = course;
        } else {
            System.out.println("course error");
        }

    }

    public void setGrade(int grade) {
        if (grade > 0 && grade < 10) {
            this.grade = grade;
        } else {
            System.out.println("grade error");
        }
    }

    public void showInfo() {
        StringBuilder name1 = this.name;
        int course1 = this.course;
        int grade1 = this.grade;

        System.out.println(name1);
        System.out.println(course1);
        System.out.println(grade1);

    }


}
