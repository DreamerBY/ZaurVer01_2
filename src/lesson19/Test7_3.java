package lesson19;

public class Test7_3 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Privet");
        StringBuilder sb2 = new StringBuilder("Poka");
        StringBuilder sb3 = new StringBuilder("OK");
        StringBuilder[] array = {sb1,sb2,sb3};
        for (StringBuilder sb : array) {
            sb.append(" Java");
        }


        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");

        }


    }
}
