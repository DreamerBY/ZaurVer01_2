package lesson20_array_list;

import java.util.ArrayList;
import java.util.*;
import java.util.Arrays;
import java.util.Objects;


public class Test6 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("A");
        StringBuilder sb2 = new StringBuilder("B");
        StringBuilder sb3 = new StringBuilder("C");
        ArrayList<StringBuilder> list1 = new ArrayList<>();
        list1.add(sb1);
        list1.add(sb2);
        list1.add(sb3);
//        ArrayList<StringBuilder> list3 = list1;
//        ArrayList <StringBuilder> list2 = (ArrayList<StringBuilder>) list1.clone();
//        System.out.println(list1.get(0)==list2.get(0));
//        list1.get(0).append("!!!");
//        list1.set(0,new StringBuilder("D"));
//        System.out.println(list1.get(0));
//        StringBuilder[] array2 = list1.toArray(new StringBuilder[10]);
//
//        Object[] array1 = list1.toArray();
//        for (Object o : array2) {
//            System.out.println(o);
        StringBuilder[] array = {sb2, sb3, sb3, sb3, sb3};
        List<StringBuilder> list8 = Arrays.asList(array);
        array[0]=new StringBuilder("!!!");
        System.out.println(list8);


    }
}

