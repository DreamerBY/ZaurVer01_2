package lesson29_data_time_home_work;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Solution {



  public static void smena (LocalDateTime ldt1, LocalDateTime ldt2, Period p, Duration d) {
    DateTimeFormatter f1 = DateTimeFormatter.ofPattern("yyyy, MMMM-dd !! hh:mm");
    DateTimeFormatter f2 = DateTimeFormatter.ofPattern("hh:mm, dd/MMM/yy");

    while(ldt1.isBefore(ldt2)){
      System.out.print ("Работаем с: " + ldt1.format(f1));
      ldt1 = ldt1.plus(p);
      System.out.println(" До: " + ldt1.format(f1));

      System.out.print ("Отдыхаем с: " + ldt1.format(f2));
      ldt1 = ldt1.plus(d);
      System.out.println(" До: " + ldt1.format(f2));
    }





  }
}
