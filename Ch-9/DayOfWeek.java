package Ducat;

import java.util.Scanner;

public class DayOfWeek {
          enum Day {
                    SUNDAY("11:00 AM - 5:00 PM"),
                    MONDAY("9:00 AM - 9:00 PM"),
                    TUESDAY("9:00 AM - 9:00 PM"),
                    WEDNESDAY("9:00 AM - 9:00 PM"),
                    THURSDAY("9:00 AM - 9:00 PM"),
                    FRIDAY("9:00 AM - 9:00 PM"),
                    SATURDAY("9:00 AM - 6:00 PM");

                    private final String businessHours;

                    Day(String businessHours) {
                              this.businessHours = businessHours;
                    }

                    public String getBusinessHours() {
                              return businessHours;
                    }
          }

          public static void main(String[] args) {
                    System.out.println("List of days:");
                    for (Day day : Day.values()) {
                              System.out.println(day);
                    }

                    Scanner sc = new Scanner(System.in);
                    System.out.print("Enter a day: ");
                    String input = sc.nextLine().toUpperCase();

                    try {
                              Day day = Day.valueOf(input);
                              System.out.println("Business hours for " + day + ": " + day.getBusinessHours());
                    } catch (IllegalArgumentException e) {
                              System.out.println("Invalid input. Please enter a valid day.");
                    }
                    sc.close();
          }
}
