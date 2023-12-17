package Ducat;

import java.util.Scanner;

public class Furniture2 {
          public static void main(String[] args) {
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Enter Wood Type Choice");
                    System.out.println("1-Pine");
                    System.out.println("2-Oak");
                    System.out.println("3-mahogany");
                    int wood_choice = sc.nextInt();
                    if (wood_choice != 1 && wood_choice !=2 && wood_choice !=3) {
                              System.out.println("Invalid Wood Code Price = 0Rs");
                    } 
                    else {
                              System.out.println("Enter 1 for large table or 2 for small table");
                              int k = sc.nextInt();
                              if(k==1){
                                        if(wood_choice==1){
                                                  System.out.println("Pine Wood Price = 135Rs");
                                        }else if(wood_choice==2){
                                                  System.out.println("Oak Wood Price = 260Rs");
                                        }else{
                                                  System.out.println("mahogany wood Price = 345Rs");
                                        }
                              }
                              else if(k==2){
                                        if(wood_choice==1){
                                                  System.out.println("Pine Wood Price = 100Rs");
                                        }else if(wood_choice==2){
                                                  System.out.println("Oak Wood Price = 225Rs");
                                        }else{
                                                  System.out.println("mahogany wood Price = 310Rs");
                                        }
                              }
                              else{
                                        System.out.println("Entered size is Invalid");
                              }
                    }
                    sc.close();
          }
}
