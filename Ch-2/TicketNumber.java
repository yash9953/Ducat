package Ducat;

import java.util.Scanner;

public class TicketNumber {
          public static void main(String[] args) {
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Enter 6-digit ticket number");
                    int ticket_number = sc.nextInt();
                    int n = (ticket_number/10)%7;
                    ticket_number%=10;
                    System.out.println("Is Valid : "+(n==ticket_number));
                    sc.close();
          }
}
