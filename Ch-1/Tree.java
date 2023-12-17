package Ducat;

import java.util.Scanner;

public class Tree {//print tree pattern by taking its length as (n)
          public static void printTree(int n){
                    for(int i=1;i<=n;i++){
                              for(int j=n-i-1;j>=1;j--){
                                        System.out.print(" ");
                              }
                              for(int j=1;j<=i&&i<n;j++){
                                        System.out.print("*");
                              }
                              if(i>1&&i<n){
                                        for(int j=i-1;j>=1;j--){
                                                  System.out.print("*");
                                        }
                              }
                              if(i==n){
                                        for(int j=1;j<n;j++){
                                                  if(j==n-1){
                                                            System.out.print("*");
                                                  }else{
                                                            System.out.print(" ");
                                                  }
                                        }
                              }
                              System.out.println();
                    }
          }
          public static void main(String[] args) {
                    //By Getting Length of tree from user(n)
                    Scanner sc =new Scanner(System.in);
                    int n =sc.nextInt();
                    printTree(n);
                    sc.close();
          }
}
