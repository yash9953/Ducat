package Ducat;

import java.util.Scanner;

public class Eggs {
          static void display(int n){
                    System.out.println(n+" eggs is "+n/12+" full dozen (with "+n%12+" eggs remaning).");
          }
          public static void main(String[] args) {
                    Scanner sc=new Scanner(System.in);
                    int numberOfEggs = sc.nextInt();
                    display(numberOfEggs);
                    sc.close();
          }
}
