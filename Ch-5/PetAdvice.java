package Ducat;

import java.util.Scanner;

public class PetAdvice {
          public static void main(String[] args) {
                    Scanner sc=new Scanner(System.in);
                    System.out.println("Enter 1.Apartment 2.House 3.Dormitory");
                    int a = sc.nextInt();
                    System.out.println("Enter One of given time category you live in home");
                    System.out.println("1. 18 or more");
                    System.out.println("2. 10 to 17");
                    System.out.println("3. 8 to 9");
                    System.out.println("4. 6 to 7");
                    System.out.println("5. 0 to 5");
                    int b = sc.nextInt();

                    if(a==1){
                              if(b==1){//18 or more
                                        System.out.println("Pot-bellied pig");
                              }
                              else if(b==2){//10 to 17
                                        System.out.println("Dog");
                              }
                              else{//fewer than 10 (9 to 10)
                                        System.out.println("snake");
                              }
                    }
                    else if(a==2){
                              if(b==2||b==1){//10 or more
                                        System.out.println("Cat");
                              }
                              else{//fewer than 10 (9 to 10)
                                        System.out.println("Hamster");
                              }
                    }
                    else if(a==3){
                              if(b==1||b==2||b==3||b==4){//more than 6
                                        System.out.println("Fish");
                              }
                              else{//less than 6 (0 to 5)
                                        System.out.println("Ant Farm");
                              }
                              
                    }
                    else{
                              System.out.println("Enter Valid Home number");
                    }
                    sc.close();
          }
}
