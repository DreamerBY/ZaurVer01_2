package lesson17_dz;

public class Solution {
    public boolean ravenstvo(StringBuilder sb1, StringBuilder sb2) {
        boolean result =true;
        if (sb1.length()==sb2.length()) {
            boolean bol1;
            bol1 = true;
            for (int i = 0; i < sb1.length(); i++) {
                char ch1 = sb1.charAt(i);
                char ch2 = sb2.charAt(i);
                if (ch1 != ch2) {

                    result = false;
                    break;
                }

            }
            System.out.println("TRUE");
            return true;
        }else
            result = false;
        System.out.println(result);
        return result;
    }


    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Hello");
        StringBuilder sb2 = new StringBuilder("Hello");
        Solution sol = new Solution();
        sol.ravenstvo(sb1, sb2);

    }

}
