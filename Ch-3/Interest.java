package Ducat;

import java.util.Scanner;

public class Interest {
          static float calculate(double i,float r){
                    return (float)(i+(i*(r/100)));
          }
          public static void main(String[] args) {
                    Scanner sc=new Scanner(System.in);
                    System.out.println("Enter Investment Value");
                    double investment = sc.nextDouble();
                    float rate = 5;
                    System.out.println("Amount "+calculate(investment, rate));
                    sc.close();
          }
}
