package Ducat;

import java.util.Scanner;

public class CountLetters {
          public static void main(String[] args) {
                    Scanner sc = new Scanner(System.in);
                    String s = sc.nextLine();
                    // String s = "Hi this Is Yash You know?";
                    String a[]=s.split(" ");
                    System.out.println("Total Letter in String ("+s+") = "+a.length);
                    sc.close();
          }
}
