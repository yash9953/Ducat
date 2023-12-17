package Ducat;

import java.util.Scanner;

public class FastFood2 {
          public static void main(String[] args) {
                    Scanner sc=new Scanner(System.in);
                    int count = 0;
                    float bill = 0;
                    String line1="------------------";
                    String line2="(1) Cheeseburger          4.99";
                    String line3="(2) Pepsil                2.00";
                    String line4="(3) Chips                 0.75";
                    String line5="---------------------";
                    while (++count<=3) {
                              System.out.println(line1);
                              System.out.println(line2);
                              System.out.println(line3);
                              System.out.println(line4);
                              System.out.println(line5);
                              if(count==1){
                                        System.out.println("Select "+count+"st Item");
                              }
                              else if(count==2){
                                        System.out.println("Select "+count+"nd Item");
                              }
                              else{
                                        System.out.println("Select "+count+"rd Item");
                              }
                              int choice = sc.nextInt();
                              if(choice==1){
                                        bill+=4.99;
                                        line2="";
                              }
                              else if(choice==2){
                                        bill+=2.00;
                                        line3="";
                              }
                              else if(choice==3){
                                        bill+=0.75;
                                        line4="";
                              }
                              else{//choice == 0
                                        bill+=0;
                              }
                              System.out.println("Your Bill for "+count+" items = "+bill);
                    }
                    sc.close();
          }
}
