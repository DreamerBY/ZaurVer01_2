package lesson20_array_list_1;

import java.util.ArrayList;

public class Test3_1 {
    public static void main(String[] args) {
        ArrayList<StringBuilder> list = new ArrayList<>();
        list.add(new StringBuilder("poka"));
        list.add(new StringBuilder("privet"));
        list.add(new StringBuilder("ok"));
        list.add(1, new StringBuilder("hello"));


        for (StringBuilder s : list) {
            System.out.print(s + " ");
        }

        System.out.println();
        ArrayList<StringBuilder> list2 = new ArrayList<>();
        list2.add(new StringBuilder("Petrov"));
        list2.add(new StringBuilder("Sidorov"));
        list.addAll(list2);



        // list.addAll(list);
        //  list.remove("poka");
//        list.set(1,"!!!");
        for (int i = 0; i < list2.size(); i++) {
            System.out.print(list2.get(i) + " ");
        }
        //  System.out.println (list.get(2)+" ");
        System.out.println();
        for (StringBuilder s : list) {
            System.out.print(s + " ");
        }
        list2.get(1).append("!");

        System.out.println();
        for (StringBuilder s : list) {
            System.out.print(s + " ");
        }

        list.clear();

        System.out.println();
        for (StringBuilder s : list) {
            System.out.print(s + " ");
        }



    }


}
