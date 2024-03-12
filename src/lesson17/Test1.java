package lesson16_string2;

public class Test1 {
//    public static void main(String[] args) {
//        String s1= "Privet";
//        System.out.println(s1.isBlank());
//        String s2= "                 ";
//        System.out.println(s2.isBlank());
//    }

    //    public static void main(String[] args) {
//        String s3= "";
//        System.out.println(s3.isEmpty());
//    }
    public static void main(String[] args) {
        String s4 = "        Privet          ";
//      System.out.println(s4.strip());
//      System.out.println(s4.stripLeading());
//      System.out.println(s4.stripTrailing());
        String s5 = "Poka";
        String s6 = s5.strip();
        System.out.println(s5 == s6);
    }


}
