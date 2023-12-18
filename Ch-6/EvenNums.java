package Ducat;

public class EvenNums {
          public static void main(String[] args) {
                    int j = 1;
                    for(int i=2;i<=100;i++){
                              if(i%2==0){
                                        if(j*20==i){
                                                  System.out.println();
                                                  System.out.print(i+" ");
                                                  j+=1;
                                                  continue;
                                        }
                                        System.out.print(i+" ");
                              }
                    }
          }
}
