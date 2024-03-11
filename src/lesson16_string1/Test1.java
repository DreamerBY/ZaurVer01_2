package lesson16_string1;

public class Test1 {
    public static void main(String[] args) {
        String s1 = new String("abcdefgabcd");
        int a =s1.length();
        System.out.println(a);

        char c1=s1.charAt(3);
        System.out.println(c1);
        int i1 = s1.indexOf('t');
        System.out.println(i1);

        int i2 = s1.indexOf("vet");
        System.out.println(i2);

        int i3 = s1.indexOf("Z");
        System.out.println(i3);//-1

        int i4 = s1.indexOf('a',5);
        System.out.println(i4);//-1
        int i41 = s1.indexOf("a",5);
        System.out.println(i41);//-1

        boolean i5 = s1.startsWith("abc");
        System.out.println(i5);//-1

        boolean i6 = s1.startsWith("abc",5);
        System.out.println(i6);//-1

        boolean b2 = s1.endsWith("cd");
        System.out.println(b2);




    }
}
