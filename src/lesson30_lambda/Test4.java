package lesson30_lambda;
public class Test4 {

    static void def(Test5 t) {
        System.out.println(t.abc("Privet"));
    }
    public static void main(String[] args) {
        def (x->{return x.length();});
    }
}
interface Test5 {
    int abc(String s1);
}

