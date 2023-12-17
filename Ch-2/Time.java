package Ducat;

import java.util.Scanner;

public class Time {
          public static void main(String[] args) {
                    Scanner sc=new Scanner(System.in);
                    int minutes = sc.nextInt();
                    System.out.println(minutes/60+" hours "+minutes%60+" minutes");
                    sc.close();
          }
}
