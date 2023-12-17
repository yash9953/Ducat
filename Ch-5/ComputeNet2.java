package Ducat;

import java.util.Scanner;

public class ComputeNet2 {
          public static void main(String[] args) {
                    Scanner sc=new Scanner(System.in);
                    System.out.println("Enter Hourly Pay Rate");
                    int hour = sc.nextInt();
                    System.out.println("Enter Hours Worked");
                    int worked_hour = sc.nextInt();
                    double grosspay = hour*worked_hour;
                    int withholdingtax = 0 ;
                    if(grosspay<=300.00){
                              withholdingtax = 10;
                    }
                    else if(grosspay>=300.01&&grosspay<=400.00){
                              withholdingtax = 12;
                    }
                    else if(grosspay>=400.01&&grosspay<=500.00){
                              withholdingtax = 15;
                    }
                    else if(grosspay>=500.01){
                              withholdingtax = 20;
                    }
                    else{
                              withholdingtax = 0;
                    }
                    double netpay = grosspay-(grosspay*withholdingtax)/100;
                    System.out.println("Hourly Pay Rate ="+hour);
                    System.out.println("Hours Worked = "+worked_hour);
                    System.out.println("GrossPay = Rs"+grosspay);
                    System.out.println("WithHolding Tax = "+withholdingtax);
                    System.out.println("Net Pay = Rs"+netpay);
                    sc.close();
          }
}
