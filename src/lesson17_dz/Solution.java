package lesson17_dz;

public class Solution {
    public boolean ravenstvo(StringBuilder sb1, StringBuilder sb2) {
        boolean bol1;
        bol1 = true;
        for (int i = 0; i < sb1.length(); i++) {
            char ch1 = sb1.charAt(i);
            char ch2 = sb2.charAt(i);
            if (ch1 != ch2) {
                System.out.println("false");
                return false;
            }

        }
        System.out.println("TRUE");
        return true;


    }


    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Hewewllo");
        StringBuilder sb2 = new StringBuilder("Hello");
        Solution sol = new Solution();
        sol.ravenstvo(sb1, sb2);

    }

}
