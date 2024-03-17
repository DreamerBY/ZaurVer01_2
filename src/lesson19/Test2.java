package lesson19;

public class Test2 {
    static void summa(String s, int... a) {
        int summa = 0;
        for (int i = 0; i < a.length; i++) {
            summa += a[i];
        }
        System.out.println(summa);

        System.out.println(s);
    }

    public void abc(int[]... array) {
    }

    public static void main(String[] args) {
        //  summa("ok",6,2,5,6,7,8);
        summa("ok", new int[]{1, 2, 3});
        summa("ok", null);
    }

}
