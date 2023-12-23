package Ducat;

import java.util.Scanner;

public class PizzaChoice {
          public static void main(String[] args) {
                    Scanner sc=new Scanner(System.in);
                    System.out.println("Enter Pizza size as S,M,L,X");
                    String size = sc.next();
                    if(size.equals("S")){
                              System.out.println("Price = Rs6.99");
                    }
                    else if(size.equals("M")){
                              System.out.println("Price = Rs8.99");
                    }
                    else if(size.equals("L")){
                              System.out.println("Price = Rs12.50");
                    }
                    else if(size.equals("X")){
                              System.out.println("Price = Rs15.00");
                    }
                    else{
                              System.out.println("Invalid Prize size");
                    }
                    sc.close();
          }
}
