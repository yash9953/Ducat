package Ducat;

import java.util.Scanner;

class Delivery {//Constructor practice question
          int year, distance_code;
          String delivery_num;
          double weight;
          double fee;

          Delivery() {
          }

          Delivery(int y, String delivery_num, double w, int distance_code) {
                    year = y;
                    int n = delivery_num.length();
                    if (n == 1) {
                              this.delivery_num = year + "000" + delivery_num;
                    } else if (n == 2) {
                              this.delivery_num = year + "00" + delivery_num;
                    } else if (n == 3) {
                              this.delivery_num = year + "0" + delivery_num;
                    } else {
                              this.delivery_num = year + delivery_num;
                    }
                    weight = w;
                    this.distance_code = distance_code;
          }

          void display() {
                    System.out.println("Hi Your Delivery Number is: " + delivery_num);
                    System.out.println("Your Delivery Item Weight: " + weight);
                    if (distance_code == 1) {
                              System.out.println("Your Choose Local Area Delivery by Entering Distance Code=1");
                    } else if (distance_code == 2) {
                              System.out.println("Your Choose LongDistance Delivery by Entering Distance Code=2");
                    }

                    System.out.println("Total Fee: " + fee(weight));
          }

          double fee(double weight) {
                    if (distance_code == 1) {
                              if (weight >= 1 && weight < 5) {
                                        fee = 12;
                              } else if (weight >= 5 && weight <= 20) {
                                        fee = 16.50;
                              } else if (weight > 20) {
                                        fee = 22;
                              } else {
                                        System.out.println("Weight should be more than 0");
                              }
                    } else if (distance_code == 2) {
                              if (weight >= 1 && weight < 5) {
                                        fee = 35;
                              } else if (weight >= 5) {
                                        fee = 47.95;
                              } else {
                                        System.out.println("Weight Should Be more than 0");
                              }
                    } else {
                              System.out.println("Distance Code should be either 1 Or 2");
                    }
                    return fee;
          }

}

public class CreateDelivery {
          public static void main(String[] args) {
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Enter Year b/w 2001 to 2025");
                    int year = sc.nextInt();
                    while(year<2001||year>2025){
                              System.out.println("Enter Year b/w 2001 to 2025");
                              year = sc.nextInt();
                    }
                    System.out.println("Enter Delivery number b/w 1 to 9999");
                    String delivery_num = sc.next();
                    while(Integer.parseInt(delivery_num)<1 || Integer.parseInt(delivery_num)>9999){
                              System.out.println("Enter Delivery number b/w 1 to 9999");
                              delivery_num = sc.next();
                    }
                    System.out.println("Enter Package Weight b/w 0.10pound to 100 pounds");
                    double weight = sc.nextDouble();
                    while(weight<0.10 || weight>100){
                              System.out.println("Enter Weight b/w 0.10 to 100");
                              weight = sc.nextDouble();
                    }
                    System.out.println("Enter 1 For Local Delivery or 2 For LongDistance Delivery");
                    int distance_code = sc.nextInt();
                    while (distance_code!=1&&distance_code!=2) {
                              System.out.println("Enter 1 For Local Delivery or 2 For LongDistance Delivery");
                              distance_code = sc.nextInt();
                    }
                    Delivery d = new Delivery(year, delivery_num, weight, distance_code);
                    d.display();
                    sc.close();
          }
}
