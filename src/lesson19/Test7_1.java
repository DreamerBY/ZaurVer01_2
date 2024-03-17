package lesson19;

public class Test7_1 {
    public static void main(String[] args) {
        String[] array = {"Privet","Poka","OK","Hi"};
        for (String s:array){
            s=new String("Hello");
        }



        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");

        }


    }
}
