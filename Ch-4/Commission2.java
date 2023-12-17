package Ducat;

class Commission{
          double sales_figure,Commission_rate;
          int rate;
          public void computeCommission(double sf,double r){
                    sales_figure = sf;
                    Commission_rate = r;
                    System.out.println("Commission = "+Commission_rate*sales_figure);
          }
          //overloading
          public void computeCommission(double sf,int r){
                    sales_figure = sf;
                    rate = r;
                    System.out.println("Commision = "+((double)r/100.0)*sales_figure);
          }
          public void computeCommission(double sf){
                    sales_figure = sf;
                    System.out.println("Commission = "+sales_figure*(7.5/100.0));
          }
}

public class Commission2 {
          public static void main(String[] args) {
                    Commission c=new Commission();
                    c.computeCommission(40);
                    c.computeCommission(40, 6.7);
                    c.computeCommission(40,8);
          }
}
