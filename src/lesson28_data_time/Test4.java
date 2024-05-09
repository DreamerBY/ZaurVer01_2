package lesson28_data_time;

import java.time.LocalDate;
import java.time.*;

public class Test4 {
  static void smenaDejurnogo (LocalDate nachalo, LocalDate konec, Period p){
    LocalDate data = nachalo;
    while(data.isBefore(konec)){
      System.out.println("Nastupila data " + data + ". Pora menyat dejurnogo");
      data = data.plus(p);
    }
  }

  public static void main(String[] args) {
    LocalTime lt = LocalTime.of(20,30);
    Period p = Period.of(2,3,15);
    lt.plus(p);
    LocalDate nachalo = LocalDate.of(2016,Month.SEPTEMBER,1);
    LocalDate konec = LocalDate.of(2025,Month.MAY,31);

    smenaDejurnogo(nachalo, konec,p);
  }

}
