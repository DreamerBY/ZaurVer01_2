package lesson20_array_list_3;

import java.util.ArrayList;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        List<String> al1 = new ArrayList<>();
        //al1.add(new Test2());
        al1.add("one");
        al1.add("two");
        al1.add("three");
        al1.add("four");
        al1.add("five");
        System.out.println("al1 = " + al1);
        for(Object o:al1){
            System.out.println("number = " + o + " and length = " + ((String) o).length());

        }

    }


}
