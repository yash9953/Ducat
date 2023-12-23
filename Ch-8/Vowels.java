package Ducat;

import java.util.Scanner;

public class Vowels {
          public static int count(String s){
                    int c = 0;
                    for(int i=0;i<s.length();i++){
                              char ch = s.charAt(i);
                              if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                                        c++;
                              }
                    }
                    return c;
          }
          public static void main(String[] args) {
                    Scanner sc=new Scanner(System.in);
                    String firstname[]=new String[5];
                    int c = 0;
                    for(int i=0;i<5;i++){
                              firstname[i] = sc.next();
                              c+=count(firstname[i]);
                    }
                    System.out.println("Total vowels -> "+c);
                    sc.close();
          }
}
