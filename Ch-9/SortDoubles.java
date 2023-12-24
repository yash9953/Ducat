package Ducat;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortDoubles {
          public static void main(String[] args) {
                    Scanner sc=new Scanner(System.in);
                    System.out.println("Enter 15 double values");
                    ArrayList<Double> list=new ArrayList<>();
                    for(int i=1;i<=15;i++){
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
                    //sort arraylist using function in ascending order
                    Collections.sort(list);
                    System.out.println("Sorted Arraylist in Ascending order");
                    System.out.println(list);
                    Collections.sort(list,Collections.reverseOrder());
                    System.out.println("Sorted ArrayList in Descending order");
                    System.out.println(list);
                    sc.close();
          }
}
