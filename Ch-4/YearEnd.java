package Ducat;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class YearEnd {
          //calculate total days from today to last day of this year
          public static void main(String[] args) {
                    LocalDate today = LocalDate.now();
                    System.out.println("Today Date = "+today);

                    LocalDate lastDate = today.withMonth(12).withDayOfMonth(31);
                    System.out.println("Last Date of this year = "+lastDate);
                    
                    long days = ChronoUnit.DAYS.between(today, lastDate);
                    System.out.println("Total Days left in completion of this year = "+days);
          }
}
