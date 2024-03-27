package lesson20_array_list_1;

import java.util.ArrayList;

import java.util.ListIterator;
//import java.util.Iterator;

public class Test7_1_iterator {
    public static void main(String[] args) {
        String s1 = "A";
        String s2 = "B";
        String s3 = "C";
        String s4 = "D";
        ArrayList<String> list1 = new ArrayList<>();

        list1.add(s1);
        list1.add(s2);
        list1.add(s3);
        list1.add(s4);

//        Iterator <String> it = list1.iterator();
//        while (it.hasNext()){
//            System.out.println(it.next());
//        }

        ListIterator <String> it = list1.listIterator();
        while (it.hasNext()){
            System.out.println(it.next());


        }
        ListIterator <String> it2 = list1.listIterator();
        while (it2.hasNext()){
            System.out.println("del "+it2);
            it2.next();
            it2.remove();
        }


        ListIterator <String> it1 = list1.listIterator();
        while (it1.hasNext()){

            System.out.println(it1.next());


        }

    }


}
