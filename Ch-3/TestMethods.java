package Ducat;

import java.util.Scanner;

public class TestMethods {
          static void displayIt(int a,int b){
                    System.out.println("In displayIt()");
                    System.out.println("A = "+a);
                    System.out.println("B = "+b);
          }
          static void displayItTimesTwo(int a,int b){
                    System.out.println("In displayItTimesTwo()");
                    System.out.println("A = "+2*a);
                    System.out.println("B = "+2*b);
          }
          static void displayItPlusOneHundred(int a,int b){
                    System.out.println("In displayItPlusOneHundred()");
                    System.out.println("A = "+(a+100));
                    System.out.println("B = "+(b+100));
          }
          public static void main(String[] args) {
                    Scanner sc =new Scanner(System.in);
                    System.out.println("Enter two number a & b");
                    int a = sc.nextInt();
                    int b = sc.nextInt();
                    displayIt(a, b);System.out.println();
                    displayItTimesTwo(a, b);System.out.println();
                    displayItPlusOneHundred(a, b);
                    sc.close();
          }
}
