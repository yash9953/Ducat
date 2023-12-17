package Ducat;

import java.util.Scanner;

public class Calculate {
          public static void main(String[] args) {
                    Scanner sc=new Scanner(System.in);
                    System.out.println("Enter two number");
                    int a = sc.nextInt();
                    int b = sc.nextInt();
                    System.out.println("Enter 1.Add 2.Subtract 3.multiply 4.divide");
                    int k = sc.nextInt();
                    if(k==1){
                              System.out.println("Addtion = "+(a+b));
                    }
                    else if(k==2){
                              System.out.println("Subtract = "+(b-a));
                    }
                    else if(k==3){
                              System.out.println("multiply = "+(a*b));
                    }
                    else if(k==4){
                              if(b==0){
                                        System.out.println("Arithmetic Exception");
                              }else{
                                        System.out.println("Division = "+(a/b));          
                              }
                    }
                    else{
                              System.out.println("Choose Correct operation from 1 to 4");
                    }
                    sc.close();
          }
}
