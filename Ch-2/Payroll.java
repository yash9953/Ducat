package Ducat;

import java.util.Scanner;

public class Payroll {
          public static void main(String[] args) {
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Enter hourly rate pay: ");
                    int hourly_rate = sc.nextInt();
                    System.out.println("Enter number of hours worked: ");
                    int worked_hour = sc.nextInt();
                    int gross_salary = hourly_rate*worked_hour;
                    int withholding_tax = (gross_salary*15)/100;
                    int net_salary = gross_salary - withholding_tax;
                    System.out.println("Your net Pay = "+net_salary);
                    sc.close();
          }
}
