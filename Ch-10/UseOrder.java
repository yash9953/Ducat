package Ducat;

import java.util.Scanner;

class Order{
          private String customer_name;
          private int customer_number,quantity_number;
          private float unit_price = 5 ;
          protected static float total_price;
          public void setname(String s){
                    customer_name=s;
          }
          public void setcustomer_number(int n){
                    customer_number=n;
          }
          public void setquantity_number(int n){
                    quantity_number=n;
          }
          public void computePrice(){
                    total_price=unit_price*quantity_number;
          }
          public void display(){
                    System.out.println("Hi "+customer_name);
                    System.out.println("Your customer number is "+customer_number);
                    System.out.println("Item Quantity "+quantity_number);
                    System.out.println("Unit Price "+unit_price);
                    System.out.println("Your total price is "+total_price);
          } 
}
class ShippedOrder extends Order{
          public void computePrice(){
                    total_price=total_price+4;
                    //adding shipping & handling charge
          }
}

public class UseOrder {
          public static void main(String[] args) {
                    Scanner sc = new Scanner(System.in);
                    Order o=new Order();
                    System.out.println("Enter Your name");
                    String name = sc.nextLine();
                    o.setname(name);
                    System.out.println("Enter Your Customer number");
                    int customer_number=sc.nextInt();
                    o.setcustomer_number(customer_number);
                    System.out.println("Enter Quantity ");
                    int quantity_number=sc.nextInt();
                    o.setquantity_number(quantity_number);
                    o.computePrice();
                    o.display();
                    ShippedOrder so=new ShippedOrder();
                    so.computePrice();
                    o.display();
                    sc.close();
          }
}
