package Ducat;

import java.util.ArrayList;
import java.util.Scanner;

public class Median {
          public static void main(String[] args) {
                    Scanner sc=new Scanner(System.in);
                    ArrayList<Double> list =new ArrayList<>();
                    System.out.println("Enter 9 double values");
                    for(int i=1;i<=9;i++){
                              double a = sc.nextDouble();
                              list.add(a);
                    }
                    double median = 0;
                    int size = list.size();
                    median = list.get(size/2);
                    System.out.println("median of 9 elements = "+median);
                    sc.close();
          }
}
