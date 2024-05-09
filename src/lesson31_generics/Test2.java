package lesson31_generics;

import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {
        ArrayList <Integer> al1 = new ArrayList<>();














        al1.add(10);
        al1.add(30);
        al1.add(150);

        ArrayList <String> al2 = new ArrayList<>();
        al2.add("a");
        al2.add("b");
        al2.add("c");
        int a = GenMethod.getSecondElements(al1);
        String s = GenMethod.getSecondElements(al2);
        System.out.println(a);
        System.out.println(s);
    }
}

class GenMethod{
    public static <T> T getSecondElements (ArrayList <T> al){
        return al.get(1);
    }
}
