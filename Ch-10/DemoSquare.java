package Ducat;

class Square {
          float height, width, surfacearea;

          Square() {

          }

          Square(float height, float width) {
                    this.height = height;
                    this.width = width;
          }

          float computeSurfaceArea() {// square surface area
                    surfacearea = height * width;
                    return surfacearea;
          }

          void display() {
                    System.out.println("Square surface area = " + computeSurfaceArea());
          }
}

class Cube extends Square {
          float depth;
          Cube(float depth,float height,float width){
                    super(height,width);
                    this.depth = depth;
          }
          @Override
          float computeSurfaceArea() {
                    surfacearea = 4 * height * width;
                    return surfacearea;
          }

          void display() {
                    System.out.println("Cube surface area = " +computeSurfaceArea());
          }
}

public class DemoSquare {
          public static void main(String[] args) {
                    Square s = new Square(30, 30);
                    s.display();
                    Cube c = new Cube(40,30,30);
                    c.display();
          }
}
