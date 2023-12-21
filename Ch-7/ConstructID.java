package Ducat;

import java.util.Scanner;

public class ConstructID {
          public static void main(String[] args) {
                    Scanner sc=new Scanner(System.in);
                    System.out.println("Enter Full name");
                    String name = sc.nextLine();
                    System.out.println("Enter Street Address");
                    String address = sc.nextLine();
                    String ID = "";
                    for(int i=0;i<name.length();i++){
                              String temp=""+name.charAt(i);
                              if(i==0){
                                        ID+=""+temp;
                              }
                              if(temp.equals(" ")){
                                        temp = ""+name.charAt(i+1);
                                        temp=temp.toUpperCase();
                                        ID+=""+temp;
                              }
                    }
                    for(int i=0;i<address.length();i++){
                              char c = address.charAt(i);
                              if(c>=48&&c<=57){
                                        ID+=""+c;
                              }
                    }
                    System.out.println("ID->"+ID);
                    sc.close();
          }
}
