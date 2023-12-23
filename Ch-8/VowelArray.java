package Ducat;

import java.util.Scanner;

public class VowelArray {
          public static void main(String[] args) {
                    Scanner sc = new Scanner(System.in);
                    char arr[] = { 'a', 'e', 'i', 'o', 'u' };
                    System.out.println("Enter A character");
                    char input = sc.next().charAt(0);
                    if (input >= 97 && input <= 122) {
                              for (int i = 0; i < arr.length; i++) {
                                        if (arr[i] == input) {
                                                  System.out.println("Yes Input character is lowercase and exist in array");
                                        }
                              }
                    }

                    sc.close();
          }
}
