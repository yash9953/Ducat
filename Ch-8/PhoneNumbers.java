package Ducat;

import java.util.Arrays;
import java.util.Scanner;

public class PhoneNumbers {
          public static boolean check(String n,String a[],String p[]){
                    for(int i=0;i<a.length;i++){
                              if(a[i].equals(n)){
                                        System.out.println("Phone number = "+p[i]);
                                        return true;
                              }
                    }
                    return false;
          }
          public static void main(String[] args) {
                    Scanner sc=new Scanner(System.in);
                    String names[]=new String[30];
                    String phonenum[]=new String[30];
                    Arrays.fill(names, "");Arrays.fill(phonenum, "");
                    //enter first 10 names with phone numbers
                    for(int i=0;i<10;i++){
                              if(i==0){
                                        System.out.println("Enter "+(i+1)+"st person name");
                              }
                              if(i==1){
                                        System.out.println("Enter "+(i+1)+"nd person name");
                              }
                              if(i==2){
                                        System.out.println("Enter "+(i+1)+"rd person name");
                              }
                              if(i>2){
                                        System.out.println("Enter "+(i+1)+"th person name");
                              }
                              names[i]=sc.nextLine();
                              System.out.println("Enter phone number");
                              phonenum[i]=sc.next();
                              sc.nextLine();
                    }
                    System.out.println("----------------------------------------------");
                    for(int i=10;i<30;){
                              System.out.println("Enter a name to check it is saved in phone directory");
                              String name = sc.nextLine();
                              if(name.equals("quit")){
                                        System.out.println("Closing phone directory......");
                                        break;
                              }
                              if(check(name,names,phonenum)){
                              }
                              else{
                                        System.out.println("Not exist we add it now! Enter phone number");
                                        names[i] = name;
                                        phonenum[i] = sc.next();
                                        sc.nextLine();
                                        i++;
                              }
                    }
                    sc.close();
          }
}
