package Ducat;

import java.util.ArrayList;
import java.util.Scanner;

public class Median2 {
          public static void main(String[] args) {
                    Scanner sc = new Scanner(System.in);
                    ArrayList<Double> list = new ArrayList<>();
                    System.out.println("Enter number of values to be stored in arraylist");
                    int n = sc.nextInt();
                    for (int i = 1; i <= n; i++) {
                              if (i == 1) {
                                        System.out.println("Enter " + i + "st value");
                              }
                              if (i == 2) {
                                        System.out.println("Enter " + i + "nd value");
                              }
                              if (i == 3) {
                                        System.out.println("Enter " + i + "rd value");
                              }
                              if (i > 3) {
                                        System.out.println("Enter " + i + "th value");
                              }
                              double a = sc.nextDouble();
                              list.add(a);
                    }
                    double median = 0;
                    int size = list.size();
                    if (size % 2 != 0) {
                              median = list.get(size / 2);
                              System.out.println("median of 9 elements = " + median);
                    }
                    else{
                              median = (list.get(size/2)+list.get(size/2-1))/2;
                              System.out.println("median of "+list.size()+" elements = " + median);
                    }
                    sc.close();
          }
}
