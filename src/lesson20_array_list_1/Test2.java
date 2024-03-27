package lesson20_array_list_1;

import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("poka");
        list.add("privet");
        list.add("ok");
        list.add(1, "hello");


        for (String s : list) {
            System.out.print(s + " ");
        }

        System.out.println();
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Petrov");
        list2.add("Sidorov");
        list.addAll(list2);



       // list.addAll(list);
      //  list.remove("poka");
//        list.set(1,"!!!");
        for (int i = 0; i < list2.size(); i++) {
            System.out.print(list2.get(i) + " ");
        }
        //  System.out.println (list.get(2)+" ");
        System.out.println();
        for (String s : list) {
            System.out.print(s + " ");
        }
        list2.set(1,"Ivanov");

        System.out.println();
        for (String s : list) {
            System.out.print(s + " ");
        }



    }
}
