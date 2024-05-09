package lesson22_hw_1;

public class TestStudent {
    public static void main(String[] args) {
        Student st1 = new Student();
        st1.setGrade(5);
        st1.setName (new StringBuilder ("Petrov"));
        st1.setCourse (3);
        st1.showInfo();



    }
}
