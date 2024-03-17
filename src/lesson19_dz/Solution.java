package lesson19_dz;

import java.util.Arrays;

public class Solution {
    public static String[] abc(String[]... array1) {
        //Элементом двумерного массива является одномерный массив
        int lengh = 0; // Неизвестная длинна нового массива
        for (String[] array2 : array1) { //Делаем длину нового массива
            lengh += array2.length;
        }
        String[] target = new String[lengh];//создали новый массив
        int count = 0;

        for (String[] array2 : array1) { //Заполняем новый массив
            for (String s : array2) {
                target[count] = s;
                count++;
            }
        }
        return target;
    }

    public static void main(String[] args) {
        String[] target = abc(new String[]{"ok", "privet", "poka"}, new String[]{"ok", "hello", "bye"});

            for (String s:args){
                for (int i = 0; i < target.length; i++) {
                    if (s.equals(target[i])){  //если написать наоборот то будет выходить  NullPointerException
                        target[i]=null;
                    }

                }
            }



        for (String s : target) {
            System.out.print(s + " ");
        }
        System.out.println();
    }


}


