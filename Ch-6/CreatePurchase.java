package Ducat;

import java.util.Scanner;

class Purchase{
          int invoice_number;
          double sales_amount;
          double sales_tax; //5% 
          public void setinvoicenum(int n){
                    invoice_number = n;
          }
          public void setsalesamount(double d){
                    sales_amount = d;
                    sales_tax = 0.05*sales_amount;
          }
          // public void setsalestax(double a){
          //           sales_tax = a;
          // }
          public void display(){
                    System.out.println("Invoice-number : "+invoice_number);
                    System.out.println("Sales amount : "+sales_amount);
                    System.out.println("Sales Tax : "+sales_tax);
          }
}

public class CreatePurchase {
          public static void main(String[] args) {
                    Scanner sc=new Scanner(System.in);
                    Purchase p1 =new Purchase();
                    System.out.println("Enter Invoice Number");
                    int n = sc.nextInt();
                    while(n<1000||n>8000){
                              System.out.println("Enter b/w 1000 to 8000");
                              n = sc.nextInt();
                    }
                    p1.setinvoicenum(n);
                    System.out.println("Enter Sales Amount");
                    double amt = sc.nextDouble();
                    while(amt<0){
                              System.out.println("Enter Non-negative sales amount");
                              amt = sc.nextDouble();
                    }
                    p1.setsalesamount(amt);
                    p1.display();
                    sc.close();
          }
}
