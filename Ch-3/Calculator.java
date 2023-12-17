package Ducat;

import java.util.Scanner;

public class Calculator {
          public static void main(String[] args) {
                    Scanner sc=new Scanner(System.in);
                    System.out.println("Enter Product Price");
                    float product_price = sc.nextFloat();
                    System.out.println("Enter Salesperson commission rate");
                    float salesperson_commission_rate = sc.nextFloat();
                    System.out.println("Enter customer discount rate");
                    float customer_discount_rate = sc.nextFloat();
                    float commision_rate = product_price*(salesperson_commission_rate)/100;
                    float total_price = product_price+commision_rate;
                    System.out.println("Total price withoud discount = "+total_price);
                    float final_price = total_price-total_price*(customer_discount_rate)/100;
                    System.out.println("Final Price = "+final_price);
                    sc.close();
          }
}
