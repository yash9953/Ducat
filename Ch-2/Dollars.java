package Ducat;

import java.util.Scanner;

public class Dollars {
          public static void main(String[] args) {
                    Scanner sc = new Scanner(System.in);
                    int dollar = sc.nextInt();
                    int t20s = dollar/20;
                    dollar%=20;
                    int t10s = dollar/10;
                    dollar%=10;
                    int t5s = dollar/5;
                    dollar%=5;
                    int t1s = dollar/1;
                    dollar%=1;
                    System.out.println(t20s+"->20s "+t10s+"->10s "+t5s+"->5s "+t1s+"->1s");
                    sc.close();
          }
}
