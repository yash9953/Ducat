package Ducat;

import java.util.Scanner;

public class Exponent {
          static void square(int n){
                    System.out.println("Square : "+n*n);
          }
          static void cube(int n){
                    System.out.println("Cube : "+n*n*n);
          }
          public static void main(String[] args) {
                    Scanner sc =new Scanner(System.in);
                    System.out.println("Enter number");
                    int n = sc.nextInt();
                    square(n);
                    cube(n);
                    sc.close();
          }
}
