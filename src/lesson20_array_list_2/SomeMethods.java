package lesson20_array_list_2;

import java.util.Arrays;

public class SomeMethods {
    public static void main(String[] args) {
        int[] array2 = {1, 2, 3, 4, 5};
        int[] array1 = {1, 2, 3, 5};
        int[] array5 = {1, 2, 3, 5};

        char[] array3 = {'p', 'i', 'v', 'e', 't'};
        char[] array6 = {'p', 'i', 'v', 'e', 't', 'o'};
        char[] array4 = {'p', 'i', 'v', 'i', 'v', 'k', 'a'};
        char[] array7 = null;

        System.out.println(Arrays.mismatch(array1, array2));
    }
}
