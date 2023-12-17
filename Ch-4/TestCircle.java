package Ducat;

class Circle{
          double radius,diameter,area;
          double pi = Math.PI;
          Circle(double r){
                    radius = r;
                    diameter = 2*r;
                    area = pi*r*r;
          }
          void setradius(double r){
                    radius = r;
                    diameter = 2*r;
                    area = pi*r*r;
          }
          double getradius(){
                    return radius;
          }
          void display(){
                    System.out.println("Radius : "+radius);
                    System.out.println("Diameter : "+diameter);
                    System.out.println("Area : "+area);
          }
}

public class TestCircle {
          public static void main(String[] args) {
                    Circle c1 =new Circle(2.5);
                    c1.display();
                    System.out.println();
                    Circle c2 = new Circle(4);
                    c2.display();
                    System.out.println();
                    c2.setradius(5);
                    c2.display();
          }
}
