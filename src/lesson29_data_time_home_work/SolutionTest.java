package lesson29_data_time_home_work;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;

public class SolutionTest {
  public static void main(String[] args) {
    Period p = Period.of (0,1,2);
    Duration d = Duration.ofMinutes(600);
    LocalDateTime ldt1 = LocalDateTime.of(2016, Month.JANUARY, 1, 9, 0,0);
    LocalDateTime ldt2 = LocalDateTime.of(2016, 10, 31, 18, 00);
    Solution.smena (ldt1,ldt2,p,d);
  }
}
