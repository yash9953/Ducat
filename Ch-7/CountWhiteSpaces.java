package Ducat;

import java.util.Scanner;

public class CountWhiteSpaces {
          public static void main(String[] args) {
                    Scanner sc = new Scanner(System.in);
                    // String s = sc.nextLine();
                    String s = "Hi this Is Yash You know?";
                    int c = 0;
                    for(int i=0;i<s.length();i++){
                              char ch=s.charAt(i);
                              if(ch==' '){
                                        c++;
                              }
                    }
                    System.out.println("Total WhiteSpaces in String ("+s+") = "+c);
                    sc.close();
          }
}
