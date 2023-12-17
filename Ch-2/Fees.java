package Ducat;

import java.util.Scanner;

public class Fees {
          public static void main(String[] args) {
                    Scanner sc =new Scanner(System.in);
                    System.out.println("Enter Credit Hours");
                    int credit_hours = sc.nextInt();
                    System.out.println("Enter money spent on Books");
                    int book_amount = sc.nextInt();
                    int athletic_fee = 65;//Dollar
                    System.out.println("------Fee Descript------");
                    System.out.println("Amount on Credit Hours = "+credit_hours+" X "+65+" = "+credit_hours*65);
                    System.out.println("Amount Spend on Book = "+book_amount);
                    System.out.println("Total Fee = "+(credit_hours*65+book_amount+athletic_fee));
                    sc.close();
          }
}
