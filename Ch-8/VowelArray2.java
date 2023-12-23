package Ducat;

import java.util.Scanner;

public class VowelArray2 {
          public static void main(String[] args) {
                    Scanner sc = new Scanner(System.in);
                    char arr[] = { 'a', 'e', 'i', 'o', 'u' };
                    System.out.println("Enter A character");
                    char input = sc.next().charAt(0);
                    if (input >= 65 && input <= 90 || input >= 97 && input <= 122) {
                              char c = Character.toLowerCase(input);
                              for (int i = 0; i < arr.length; i++) {
                                        if (arr[i] == c) {
                                                  System.out.println("Yes Input character is exist in array");
                                        }
                              }
                    }
                    sc.close();
          }
}
