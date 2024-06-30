package lesson29_data_time;
import java.time.LocalDateTime;

public class Test1 {
  public static void main(String[] args) {
//    System.out.println(LocalDate.now());
//    System.out.println(LocalTime.now());
//    System.out.println(LocalDateTime.now());

//    LocalDate ld1 = LocalDate.of(20140, 5, 15);
//    System.out.println(ld1);
//      ld1 = ld1.plusDays(17);
//    System.out.println(ld1);


//    LocalTime lt1 = LocalTime.of(15, 30); //immutable - не изменяется
//    System.out.println(lt1);
//    lt1 = lt1.plusHours(1);
//    lt1 = lt1.minusMinutes(10);
//    lt1 = lt1.plusSeconds(18);
//    lt1 = lt1.minusNanos(5);
//    System.out.println(lt1);


    LocalDateTime ldt1 = LocalDateTime.of(2015, 9, 10, 17, 25);
    System.out.println(ldt1);
    ldt1 = ldt1.plusYears(3).minusMonths(2).plusMinutes(15000).minusSeconds(30);
    System.out.println(ldt1);




  }


}

