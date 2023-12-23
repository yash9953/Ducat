package Ducat;

import java.util.Scanner;

public class JavaArray {
          public static void main(String[] args) {
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Enter number of reason you want to store about likes of java");
                    int size = sc.nextInt();
                    String reason[] = new String[size];
                    for(int i=0;i<reason.length;i++){
                              if(i==0){
                                        System.out.println("Enter "+i+"st index reason");
                              }
                              if(i==1){
                                        System.out.println("Enter "+i+"nd index reason");
                              }
                              if(i==2){
                                        System.out.println("Enter "+i+"rd index reason");
                              }
                              if(i>2){
                                        System.out.println("Enter "+i+"th index reason");
                              }
                              reason[i]=sc.nextLine();
                    }
                    System.out.println("Enter index from 0 to "+size+" to print than index reason");
                    int i = sc.nextInt();
                    System.out.println("-------------------------------------------");
                    System.out.println(reason[i]);
                    sc.close();
          }
}
