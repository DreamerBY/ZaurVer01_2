package lesson16_dz;

public class Solution {
    static String em1="ya@yahoo.com;";
    static String em2="on@mail.ru;";
    static String em3="ona@gmail.com;";


    public static void email(String em) {
        char c1;

        String st1 = em;


        for (int i=st1.indexOf('@')+1 ;i<em.length();i++) {
            c1 = st1.charAt(i);
            if (c1=='.'){
                System.out.println();
                break;
            }
            System.out.print (c1);
        }


    }

    public static void main(String[] args) {
        email(em1);
        email(em2);
        email(em3);
    }



}



