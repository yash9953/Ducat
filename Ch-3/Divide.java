package Ducat;

import java.util.Scanner;

public class Divide {
          static void divide(int a,int b){
                    System.out.println("Division Result = "+a/b);
                    System.out.println("Remainder Left = "+a%b);
          }
          public static void main(String[] args) {
                    Scanner sc=new Scanner(System.in);
                    System.out.println("Enter two numbers");
                    int a = sc.nextInt();
                    int b = sc.nextInt();
                    divide(a, b);
                    sc.close();
          }
}
