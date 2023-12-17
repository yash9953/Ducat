package Ducat;

import java.util.Random;

public class MathTest {
          public static void main(String[] args) {
                    double sq = Math.pow(30,2);
                    System.out.println("Square root of 30="+sq);
                    double sine = Math.sin(100);
                    System.out.println("Sine of 100="+sine);
                    double cosine = Math.cos(100);
                    System.out.println("Cosine of 100="+cosine);
                    double floor = Math.floor(44.7);
                    System.out.println("Floor of 44.7="+floor);
                    double ceiling = Math.ceil(44.7);
                    System.out.println("Ceiling of 44.7="+ceiling);
                    double round = Math.round(44.7);
                    System.out.println("Round of 44.7="+round);
                    int large = Math.max('K', 70);
                    System.out.println("Maximum of K & 70="+large);
                    int small = Math.min('K',70);
                    System.out.println("Small of K & 70="+small);
                    Random rd = new Random();
                    int random = rd.nextInt(10)+1; 
                    System.out.println("Random b/w 1 to 10 ="+random);
          }
}
