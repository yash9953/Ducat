package Ducat;

public class Prices {
          public static void main(String[] args) {
                    //20 elements in price array
                    double price[]={2.34, 7.89, 1.34, 8.88, 7.56, 5.00, 4.99, 32.99, 6.43, 2.56,
                    4.34, 9.89, 1.34, 4.88, 3.56, 8.00, 1.99, 43.99, 4.43, 6.56 };
                    double sum = 0;
                    for(int i=0;i<price.length;i++){
                              sum+=price[i];
                    }
                    System.out.println("Sum of all the prices = "+sum);
                    System.out.println("-----------------------------------");
                    System.out.println("All values less than Rs5.00");
                    for(int i=0;i<price.length;i++){
                              if(price[i]<5.00){
                                        System.out.print(price[i]+" ");
                              }
                    }
                    System.out.println();
                    System.out.println("---------------------");
                    double avg = sum/price.length;
                    System.out.println("Average of prices = "+(sum/price.length));
                    System.out.println("---------------------------");
                    System.out.println("All values greater than average");
                    for(int i=0;i<price.length;i++){
                              if(price[i]>avg){
                                        System.out.print(price[i]+" ");
                              }
                    }
          }
}
