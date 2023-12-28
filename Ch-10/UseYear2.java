package DucatOOps;

import java.util.Scanner;

class Year2 {
          int days;

          Year2() {
                    days = 365;
          }

          int getday() {
                    return days;
          }

          void setday(int i) {
                    days = i;
          }

          int daysElap(int m, int d) {
                    int daysElapsed = d - 1;
                    switch (m) {
                              case 12:
                                        daysElapsed += 30;
                              case 11:
                                        daysElapsed += 31;
                              case 10:
                                        daysElapsed += 30;
                              case 9:
                                        daysElapsed += 31;
                              case 8:
                                        daysElapsed += 31;
                              case 7:
                                        daysElapsed += 30;
                              case 6:
                                        daysElapsed += 31;
                              case 5:
                                        daysElapsed += 30;
                              case 4:
                                        daysElapsed += 31;
                              case 3:
                                        daysElapsed += 28;
                              case 2:
                                        daysElapsed += 31;
                              case 1:
                                        break;
                              default:
                                        System.out.println("Invalid month entered.");
                                        break;
                    }
                    return daysElapsed;
          }
}

class LeapYear2 extends Year2 {
          LeapYear2() {
                    super();
                    setday(366);
          }

          @Override
          int daysElap(int m, int d) {
                    int daysElapsed = d - 1;
                    switch (m) {
                              case 12:
                                        daysElapsed += 30;
                              case 11:
                                        daysElapsed += 31;
                              case 10:
                                        daysElapsed += 30;
                              case 9:
                                        daysElapsed += 31;
                              case 8:
                                        daysElapsed += 31;
                              case 7:
                                        daysElapsed += 30;
                              case 6:
                                        daysElapsed += 31;
                              case 5:
                                        daysElapsed += 30;
                              case 4:
                                        daysElapsed += 31;
                              case 3:
                                        daysElapsed += 29;
                              case 2:
                                        daysElapsed += 31;
                              case 1:
                                        break;
                              default:
                                        System.out.println("Invalid month entered.");
                                        break;
                    }
                    return daysElapsed;
          }
}

public class UseYear2 {
          public static void main(String[] args) {
                    Scanner sc = new Scanner(System.in);
                    Year2 y = new Year2();
                    LeapYear2 l = new LeapYear2();
                    System.out.println("Days in a year = " + y.getday());
                    System.out.println("Days in a leap year = " + l.getday());
                    System.out.println("enter months in numbers");
                    int m = sc.nextInt();
                    System.out.println("enter day");
                    int n = sc.nextInt();
                    System.out.println("Days elapsed from 1 Jan in non-leap year=> " + y.daysElap(m, n));
                    System.out.println("Days elapsed from 1 Jan in leap year=> " + l.daysElap(m, n));
                    sc.close();
          }
}
