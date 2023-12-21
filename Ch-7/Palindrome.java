package Ducat;

import java.util.Scanner;

public class Palindrome {//check palindrome without checking capitalization or punctuation
          public static void main(String[] args) {
                    Scanner sc=new Scanner(System.in);
                    System.out.println("Enter string to check palindrome or not");
                    String str = sc.nextLine();
                    // String str = "Madam, I'm Adam";

                    String temp = "",duplicate = "";

                    for(int i=0;i<str.length();i++){
                              int c = str.charAt(i) - 0;
                              if(c>=65&&c<=90||c>=97&&c<=122){
                                        duplicate+=""+str.charAt(i);
                              }
                    }
                    duplicate = duplicate.toLowerCase();

                    for(int i=duplicate.length()-1;i>=0;i--){
                              temp+=""+duplicate.charAt(i);
                    }

                    if(duplicate.equals(temp)){
                              System.out.println("Yes It is palindrome");
                    }
                    else{
                              System.out.println("Not a palindrome");
                    }
                    sc.close();
          }
}
