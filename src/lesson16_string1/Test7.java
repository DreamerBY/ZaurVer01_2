package lesson16_string1;

public class Test7 {
    public static void main(String[] args) {
        String s1 = "Hello World";
        String s2 = "Uraaaaaa!!!!!!!!!";
        String s3=s1.concat(s2).trim().replace("Uraaaaaa!!!!!!!!!","Ура!!!!!!!").substring(6,10);
        System.out.println(s1.substring(s1.indexOf('W')));


    }
}
