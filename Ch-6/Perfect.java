package Ducat;

public class Perfect {//print perfect number from 1 to 1000
          public static void main(String[] args) {
                    for(int i=1;i<=1000;i++){
                              if(isPerfect(i)){
                                        System.out.print(i+" ");
                              }
                    }
          } 
          static boolean isPerfect(int n){
                    int s = 0;
                    for(int i=1;i<n;i++){
                              if(n%i==0){
                                        s+=i;
                              }
                    }
                    if(s==n){
                              return true;
                    }
                    return false;
          }
}
