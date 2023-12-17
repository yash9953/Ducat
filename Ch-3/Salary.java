package Ducat;

import java.util.Scanner;

public class Salary {
          static void displaySalary(float r,int rh,int h){
                    System.out.println("Salary = "+(rh*r+h*r*1.5));
          }
          public static void main(String[] args) {
                    Scanner sc=new Scanner(System.in);
                    System.out.println("Enter Hourly Pay Rate");
                    float hourly_pay_rate = sc.nextFloat();
                    System.out.println("Enter Regular Hour");
                    int regualar_hour = sc.nextInt();
                    System.out.println("Enter Overtime Hour");
                    int overtime_hour = sc.nextInt();
                    displaySalary(hourly_pay_rate,regualar_hour,overtime_hour);
                    sc.close();
          }
}
