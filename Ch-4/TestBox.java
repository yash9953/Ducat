package Ducat;

class Box{
          double length,width,height;
          Box(double length){
                    this.length = length;
                    width = 0;height = 0;
                    System.out.println("Line Created");
          }
          Box(double length,double width){
                    this.length = length;
                    this.width = width;
                    height = 0;
                    System.out.println("Rectangle Created");
          }
          Box(double length,double width,double height){
                    this.length = length;
                    this.width = width;
                    this.height = height;
                    System.out.println("Box Created");
          }
          double cal_area(){
                    if(width == 0){
                              return length;
                    }
                    if(height ==0){
                              return length*width;
                    }
                    return 2*(length*width+width*height+length*height);
          }
}

public class TestBox {
          public static void main(String[] args) {
                    Box b1 = new Box(2);
                    System.out.println("No Area Of Line Only Length->"+b1.cal_area());
                    Box b2 = new Box(2, 4);
                    System.out.println("Area of Rectangle ->"+b2.cal_area());
                    Box b3 = new Box(2,4,3);
                    System.out.println("Area of Box ->"+b3.cal_area());
          }
}
