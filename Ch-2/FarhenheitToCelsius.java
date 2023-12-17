package Ducat;

import java.util.Scanner;

public class FarhenheitToCelsius {
          public static void main(String[] args) {
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Enter Farhenheit Temperature");
                    float farhenheit = sc.nextFloat();
                    float celsius = ((farhenheit-32)*5)/9;
                    System.out.println("Farhenheit Temp ="+farhenheit+" Celsius ="+celsius);
                    sc.close();
          }
}
