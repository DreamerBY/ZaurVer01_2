package lesson18_array;
import java.util.Arrays;
public class Test4 {
    public static void main(String[] args) {
        int array1[] ={1,9,3,-8,0,5,4,1};
        for (int i = 0; i<array1.length;i++){
            System.out.print(array1[i] + " ");

        }
        Arrays.sort(array1);
        System.out.println();
        for (int i = 0; i<array1.length;i++){
            System.out.print(array1[i] + " ");
        }
        int indedx1 = Arrays.binarySearch(array1,2);
        System.out.println();
        System.out.println(indedx1);
        System.out.println(array1);



    }

}
