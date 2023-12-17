package Ducat;

import java.util.Scanner;

public class Room2 {
          public static void main(String[] args) {
                    Scanner sc = new Scanner(System.in);
                    int length = sc.nextInt();
                    int width = sc.nextInt();
                    int area = length*width;
                    System.out.println("Thefloorspaceis"+area+"squarefeet");
                    sc.close();
          }
}
