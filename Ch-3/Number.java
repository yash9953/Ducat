package Ducat;

import java.util.Scanner;

public class Number {
          static void sum(int a,int b){
                    System.out.println("sum = "+(a+b));
          }
          static void difference(int a,int b){
                    System.out.println("difference = "+(a-b));
          }
          static int product(int a,int b){
                    return a*b;
          }
          public static void main(String[] args) {
                    Scanner sc=new Scanner(System.in);
                    System.out.println("Enter two number");
                    int a = sc.nextInt();
                    int b = sc.nextInt();
                    sum(a, b);
                    difference(a, b);
                    System.out.println("Product = "+product(a, b));
                    sc.close();         
          }
}
