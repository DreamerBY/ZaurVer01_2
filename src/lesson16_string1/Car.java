package lesson16_string1;

public class Car {
    String color;
    String engine;

    public Car(String color, String engine) {
        this.color = color;
        this.engine = engine;
    }
    final static int a=5;

      public Car abc(String cvet){
          Car c10=new Car (cvet,"V4");
          return c10;
      }

    public static void main(String[] args) {
        Car c = new Car("red","V6");
        Car c2 = c.abc("black");
        System.out.println(c.color);
        System.out.println(c2.color);
    }


}
//class TestCar{
//    final static Car c = new Car ("red","V8");
//    public static void main(String[] args) {
//
//        c.color="black";
//    }
//
//}