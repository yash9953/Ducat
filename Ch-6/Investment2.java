package Ducat;

import java.util.Scanner;

public class Investment2 {
          public static void main(String[] args) {
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Enter Investment Amount");
                    double amount = sc.nextDouble();
                    System.out.println("Enter Time in years of investment");
                    int time = sc.nextInt();
                    System.out.println("Enter rate of interest");
                    float rate = sc.nextFloat();
                    double balance = 0;
                    if (amount == 0 || time == 0 || rate == 0) {
                              System.out.println("Invalid input");
                    } else {
                              for (int i = 1; i <= time; i++) {
                                        balance += amount * Math.pow(1 + rate / 100, i);
                                        System.out.println("Balance in " + i + " year = " + balance);
                              }
                    }

                    sc.close();
          }
}
