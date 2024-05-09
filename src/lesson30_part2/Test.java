package lesson30_part2;

import java.util.ArrayList;

public class Test {
   // var v = 10;
    public static void main(String[] args) {
        var tit = new TestInferenceType();
        var i = 10;
        var w = 1.5f;
        var array = new String [] {"a", "b", "c"};
        var result = abc();
        Object obj1 = "privet";
        var obj2 = obj1;
        ArrayList <String> al = new ArrayList <>();
        for (var s : al) {
            System.out.println(s);
        }
        //var h = "poka";
        //var array2 = {1,2};
        //var  array3 = new int [] {1, 2};
        var var = "var";




    }

    static double abc () {return 3.14;}
}

class TestInferenceType {}

interface I {
    void abc();

    default void def(){}
    default void def2(){}
    default void def3(){}
}