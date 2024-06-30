package lesson29_data_time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class Test6 {
  public static void main(String[] args) {
    LocalDate ld = LocalDate.of(2016, Month.SEPTEMBER, 1);
    LocalDateTime ldt = LocalDateTime.of(2016, Month.SEPTEMBER, 1, 16, 40);
    LocalTime lt = LocalTime.of(16, 40);


    DateTimeFormatter f = DateTimeFormatter.ofPattern("MM dd yyyy");
    LocalDate date1 = LocalDate.parse("01 02 2015", f);
    System.out.println(date1);
    LocalDate date2 = LocalDate.parse("2015-01-02");
    System.out.println(date2);









//    DateTimeFormatter d4 = DateTimeFormatter.ISO_WEEK_DATE;
//    System.out.println(ld);
//    System.out.println(ld.format(d4));



//    DateTimeFormatter d1 = DateTimeFormatter.ISO_LOCAL_DATE;
//    System.out.println(ld.format(d1));
//    System.out.println(lt);
//    DateTimeFormatter d2 = DateTimeFormatter.ISO_LOCAL_TIME;
//    DateTimeFormatter d3 = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
//    System.out.println(lt);
//    System.out.println(lt.format(d2));
//    System.out.println(ldt);
//    System.out.println(ldt.format(d3));
//    System.out.println(lt.format(DateTimeFormatter.ISO_LOCAL_TIME));
//
//    DateTimeFormatter shortFormat = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
//    System.out.println(ld);
//    System.out.println(ld.format(shortFormat));
//    System.out.println(ldt);
//    System.out.println(ldt.format(shortFormat));
//
//
//    System.out.println("********************");
//
//    DateTimeFormatter shortFormat1 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
//    System.out.println(ld);
//    System.out.println(ld.format(shortFormat1));
//    System.out.println(ldt);
//    System.out.println(shortFormat1.format(ldt));
//    System.out.println(lt);
//    System.out.println(lt.format(shortFormat1));


  }


}
