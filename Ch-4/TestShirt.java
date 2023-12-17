package Ducat;

class Shirt{
          int collar_size,sleeve_length;
          final String material="cotton";
          Shirt(int c,int s){
                    collar_size = c;
                    sleeve_length = s;
          }
          void display(){
                    System.out.println("material : "+material);
                    System.out.println("Collar Size : "+collar_size);
                    System.out.println("Sleeve Length : "+sleeve_length);
          }
}

public class TestShirt {
          public static void main(String[] args) {
                    Shirt s = new Shirt(3, 15);
                    s.display();System.out.println();
                    Shirt s2 = new Shirt(2, 10);
                    s2.display();
          }
}
