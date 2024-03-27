package lesson20_array_list_1;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("privet");
        Car c = new Car();
        list.add(c);
        Student s = new Student();
        list.add(s);
        list.add(new StringBuilder("ok"));

        ArrayList<String> list2 = new ArrayList<String>();
        list2.add("poka");
        //list2.add(s);
        ArrayList<String> list21 = new ArrayList<>(30);
        ArrayList<String> list5 = new ArrayList<>(list2);
        System.out.println(list21==list5);



        ArrayList<StringBuilder> list3 = new ArrayList();
        List<StringBuilder> list31 = new ArrayList();
        list3.add(new StringBuilder("ok"));


    }
}

class Car {
}

class Student {
}
