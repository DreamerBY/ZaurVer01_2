package lesson16_dz;

public class Solution2 {
    public void email(String s) {
        int a = 0;//поз символа @
        int b = 0;//поз символа .
        int c = 0;//поз символа ;

        while (c < s.length() - 1) {

            a = s.indexOf('@', c);
            b = s.indexOf('.', c);
            c = s.indexOf(';', c + 1);
            System.out.println(s.substring(a + 1, b));
        }


    }

    public static void main(String[] args) {
        Solution2 s2 = new Solution2();
        s2.email("ya@yahoo.com; on@mail.ru; ona@gmail.com;");
    }
}
