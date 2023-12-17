package Ducat;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

// import java.util.Scanner;

public class Summer {
          public static void main(String[] args) {
                    // Get the current date
                    LocalDate today = LocalDate.now();

                    // Get the first day of next summer (June 21)
                    LocalDate nextSummer = LocalDate.of(today.getYear() + 1, 6, 21);
                    
                    // Calculate the number of days between the two dates using the DAYS.between()
                    // method
                    long days = ChronoUnit.DAYS.between(today, nextSummer);
                    // Print the result
                    System.out.println("There are " + days + " days from today until the first day of next summer.");






                    // assume first day of summer is on June 21 in non-leap year
                    // Scanner sc=new Scanner(System.in);
                    // System.out.println("Enter today date in format-> 06/Sep");
                    // String s = sc.next();
                    // int day = Integer.parseInt(s.substring(0, 2));
                    // String month = s.substring(3);
                    // System.out.println(day+" "+month);
                    // int totaldays = 0, daysfromnewyear = 31+28+31+30+31+20;
                    // if(month.equals("Jan")){
                    // totaldays = totaldays+(31-day)+28+31+30+31+20;
                    // }
                    // else if(month.equals("Feb")){
                    // totaldays = totaldays+(28-day)+31+30+31+20;
                    // }
                    // else if(month.equals("Mar")){
                    // totaldays = totaldays+(31-day)+30+31+20;
                    // }
                    // else if(month.equals("Apr")){
                    // totaldays = totaldays+(30-day)+31+20;
                    // }
                    // else if(month.equals("May")){
                    // totaldays = totaldays+(31-day)+20;
                    // }
                    // else if(month.equals("Jun")){
                    // if(day<=20){
                    // totaldays = totaldays+(20-day);
                    // }
                    // else{
                    // totaldays = totaldays+(28-day)+31+30+31+30+31+31+30+31+30+31+
                    // daysfromnewyear;
                    // }
                    // }
                    // else if(month.equals("Jul")){
                    // totaldays = totaldays+(31-day)+31+30+31+30+31+daysfromnewyear;
                    // }
                    // else if(month.equals("Aug")){
                    // totaldays = totaldays+(31-day)+30+31+30+31+daysfromnewyear;
                    // }
                    // else if(month.equals("Sep")){
                    // totaldays = totaldays+(30-day)+31+30+31+daysfromnewyear;
                    // }
                    // else if(month.equals("Oct")){
                    // totaldays = (int)totaldays+(31-day)+30+31+daysfromnewyear;
                    // }
                    // else if(month.equals("Nov")){
                    // totaldays = (int)totaldays+(30-day)+31+daysfromnewyear;
                    // }
                    // else if(month.equals("Dec")){
                    // totaldays = (int)totaldays+(31-day)+daysfromnewyear;
                    // }
                    // else{
                    // totaldays = 0;
                    // System.out.println("Invalid Month Entered");
                    // }
                    // System.out.println("Total days left to get summer first day 21 June for
                    // non-leap year = "+totaldays);
                    // sc.close();
          }
}
