package lesson18_dz;

public class Test2 {
    public static void showArray(String[][] array) {
        StringBuilder output = new StringBuilder("{");
        for (int i = 0; i < array.length; i++) {
            output.append("{");
            for (int j = 0; j < array[i].length; j++) {
                output.append(array[i][j] );
                if (j < array[i].length-1){
                    output.append(",");
                }


            }

            output.append("}");
            if (i < array.length-1){
                output.append(",");
            }


        }
        System.out.println(output + "}");

    }


    public static void main(String[] args) {
        String[][] array1 = {{"Hi", "Hello"}, {"Privet", "OK"}, {"Kostya"} ,{"Privet", "OK"}, {"Kostya"}};
        showArray(array1);
    }
}
