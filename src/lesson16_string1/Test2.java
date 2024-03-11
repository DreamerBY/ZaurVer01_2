package lesson16_string1;

public class Test2 {
    public static void main(String[] args) {
        String s1 = new String("abcdefg abcd");
        String s10=s1.substring(3);
        System.out.println(s10);
        System.out.println(s1);


        String s11=s1.substring(3,7);
        System.out.println(s11);

        String s12=s1.trim();
        System.out.println(s12);

        String s13=s1.substring(3,10);
        System.out.println(s13);


    }
}
