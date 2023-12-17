package Ducat;

import java.util.Scanner;

public class Admission {
          public static void main(String[] args) {
                    Scanner sc =new Scanner(System.in);
                    System.out.println("Enter High School Grade point Average");
                    float g = sc.nextFloat();
                    System.out.println("Enter Admission Test Score from 0 to 100");
                    int s = sc.nextInt();
                    if(g>=3.0&&s>=60||(g<3.0&&s>=80)){
                              System.out.println("Accept");
                    }
                    else if(g==0||g>4.0||s==0||s>100){
                              System.out.println("Error Invalid Grade or Score Entered");
                    }
                    else{
                              System.out.println("Reject");
                    }
                    sc.close();
          }
}
