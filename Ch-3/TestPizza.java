package Ducat;

class Pizza{
          static String toppings;
          static int diameter;
          static double price;
          Pizza(){
                    toppings = "pepperoni";
                    diameter = 12;
                    price = 13.99;

          }
          Pizza(String toppings,int diameter,double p){
                    Pizza.toppings = toppings;
                    Pizza.diameter = diameter;
                    price = p;
          }
          void display(){
                    System.out.println("Toppings ="+toppings+" diameter="+diameter+" price="+price);
          }
}

public class TestPizza {
          public static void main(String[] args) {
                    Pizza p = new Pizza();
                    p.display();
                    Pizza p2 =new Pizza("Black Pepper", 15, 20);
                    p2.display(); 
          }
}
