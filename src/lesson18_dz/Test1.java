package lesson18_dz;

//Создайте класс, в котором создайте метод sortirovka.
// Инпут параметром данного метода будет одномерный массив типа int.
// Метод должен возвращать уже отсортированный по возрастанию массив .
//Продемонстрируйте данный метод.


import java.util.Arrays;

public class Test1 {
    public static int[] sortirovka(int[] array) {
        int a;


        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int ind = i;

            for (int j = i + 1; j < array.length; j++) {

                if (min > array[j]) {
                    min = array[j];
                    ind = j;
                }

            }
            if (i != ind) {
                a=array[i];
                array[i]=min;
                array[ind]=a;


            }


        }




        System.out.println(Arrays.toString(array));
        return array;
    }

    public static void main(String[] args) {
        int[] array1 = {26, 23, 5, 12, 8, 210, 45, 435};
        sortirovka(array1);
    }

}
