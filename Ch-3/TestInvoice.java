package Ducat;

class Invoice{
          int item_number=0,quantity;
          String name;
          double price,total;
          void setname(String s){
                    item_number+=1;
                    name = s;
          }
          void setquantity(int n){
                    quantity = n;
          }
          void setprice(double p){
                    price = p;
          }
          void caltotal(){
                    total = quantity*price;
          }
          void display(){
                    System.out.println("Item Number : "+item_number);
                    System.out.println("Item Name : "+name);
                    System.out.println("Quantity : "+quantity);
                    System.out.println("Price : "+price);
                    System.out.println("Total : "+total);
          }
}

public class TestInvoice {
          public static void main(String[] args) {
                    Invoice i1 = new Invoice();
                    i1.setname("Iphone");
                    i1.setprice(30000);
                    i1.setquantity(2);i1.caltotal();
                    i1.display();
                    System.out.println();
                    Invoice i2 =new Invoice();
                    i2.setname("Ipad");
                    i2.setprice(45000);
                    i2.setquantity(1);i2.caltotal();
                    i2.display(); 
          }
}
