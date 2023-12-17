package Ducat;

import java.util.Scanner;

public class Balance2 {
          public static void main(String[] args) {
                    Scanner sc = new Scanner(System.in);
                    int checking_acc_balance = sc.nextInt();
                    int saving_acc_balance = sc.nextInt();
                    if(checking_acc_balance<10&&saving_acc_balance<100){
                              System.out.println("Both accounts are dangerously low");
                    }
                    else if (checking_acc_balance < 10) {
                              System.out.println("Checking account balance is low");
                    }
                    else if (saving_acc_balance < 100) {
                              System.out.println("Savings account balance is low");
                    }
                    sc.close();
          }
}
