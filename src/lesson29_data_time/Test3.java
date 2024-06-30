package lesson29_data_time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;


public class Test3 {
  public static void main(String[] args) {




    LocalDate ld1 = LocalDate.of(2014, 5, 31);
    LocalDate ld2 = LocalDate.of(2012, 6, 18);
    System.out.println(ld1.isBefore(ld2));



    LocalTime lt1 = LocalTime.of(15, 30); //immutable - не изменяется
    LocalTime lt2 = LocalTime.of(03, 05,18,55598); //immutable - не изменяется
    System.out.println(lt1.isAfter(lt2));


    LocalDateTime ldt1 = LocalDateTime.of(2015, 9, 10, 17, 25);
    LocalDateTime ldt2 = LocalDateTime.of(2015, 9, 10, 17, 25,9);
    System.out.println(ldt1.isBefore(ldt2));


  }
}
