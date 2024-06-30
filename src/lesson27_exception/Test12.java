package lesson27_exception;

public class Test12 {

  public static void main(String[] args) {
    Test12 t = new Test12();
    t.abc();
  }

  void abc() {
    int[] array = {1, 2, 3};
    try {
      System.out.println(array[7]);
    } catch (ArrayIndexOutOfBoundsException e) {
      String s = null;
      try {
        System.out.println(s.length());
      } catch (NullPointerException e2) {
        System.out.println("Это внутренний catch блок");
      }
    } catch (NullPointerException e) {
      System.out.println("Pojman NullPointerException");
    }
  }
}
