package Ducat;

import java.util.Scanner;

public class Exponent2 {
          static int square(int n){
                    return n*n;
          }
          static int cube(int n){
                    return n*square(n);
          }
          public static void main(String[] args) {
                    Scanner sc =new Scanner(System.in);
                    System.out.println("Enter number");
                    int n = sc.nextInt();
                    System.out.println("Square = "+square(n));
                    System.out.println("Cube = "+cube(n));
                    sc.close();
          }
}
