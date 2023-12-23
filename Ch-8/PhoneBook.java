package Ducat;

import java.util.Arrays;
import java.util.Scanner;

public class PhoneBook {
          public static void main(String[] args) {
                    Scanner sc=new Scanner(System.in);
                    System.out.println("Enter 20 names with phone numbers or zzz for exit");
                    String s = "go";
                    String names[]=new String[20];
                    Arrays.fill(names, " ");

                    String phonenumber[]=new String[20];
                    Arrays.fill(phonenumber, " ");
                    String temp;
                    int count = 0;
                    for(int i=0;i<20&&s.equals("go");i++){
                              System.out.println("Name-> ");
                              temp = sc.nextLine();
                              if(temp.equals("zzz")){
                                        s = "zzz";
                                        break;
                              }
                              names[i] = temp;
                              System.out.println("Phone Number-> ");
                              phonenumber[i] = sc.next();
                              sc.nextLine();
                              count++;
                    }
                    System.out.println("Total names entered = "+count);
                    System.out.println("-----------------------------------");
                    System.out.println("Names in phone book");
                    System.out.println("-----------------------------------");
                    for(int i=0;i<names.length;i++){
                              if(names[i].equals(" ")){
                                        break;
                              }
                              System.out.println(names[i]);
                    }
                    System.out.println("Enter name to get its phone number");
                    String getphone = sc.nextLine();
                    int k = -1;
                    for(int i=0;i<names.length;i++){
                              if(names[i].equals(getphone)){
                                        k = i;
                                        break;
                              }
                    }
                    System.out.println(getphone+" phone number is => "+phonenumber[k]);
                    sc.close();
          }
}
