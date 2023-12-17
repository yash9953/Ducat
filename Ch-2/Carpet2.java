package Ducat;

import java.util.Scanner;

public class Carpet2 {
          public static void main(String[] args) {
                    Scanner sc = new Scanner(System.in);
                    int length = sc.nextInt();
                    int width = sc.nextInt();
                    int cost_of_carpeting = sc.nextInt();
                    int area = length*width;
                    System.out.println("Total Cost of Carpeting : "+area*cost_of_carpeting);
                    sc.close();
          }
}
