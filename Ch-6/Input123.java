package Ducat;

import java.util.Scanner;

public class Input123 {
          public static void main(String[] args) {
                    Scanner sc = new Scanner(System.in);
                    int count = 3;
                    while (count-- > 0) {
                              System.out.println("Enter Input as 1,2,3,4");
                              int choice = sc.nextInt();
                              if (choice == 1 || choice == 2 || choice == 3) {
                                        System.out.println("Good job!");
                                        System.out.println("Enter Another Input");

                              } else if (choice == 4) {
                                        break;
                              }
                              else{
                                        System.out.println("Error Invalid choice is entered out of 1 to 4");
                              }
                    }
                    sc.close();
          }
}
