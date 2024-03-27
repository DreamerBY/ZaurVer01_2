package lesson20_array_list_3;

import java.util.HashMap;
import java.util.Map;

public class Test3 {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(777,"Ivanov Mikhail");
        map.put(778,"Trigulov Zaur");
        map.put(779,"Sidorova Mariya");
        map.put(780,"Petrov Petr");
        map.put(779,"Roberto Carlos");
        map.put(781,"Trigulov Zaur");
        System.out.println("map = " + map);
        map.remove(779);
        System.out.println("map = " + map);


    }

}
class Call{
    int b=4;
}
