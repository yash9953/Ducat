package Ducat;

import java.util.Scanner;

public class Swimming {
          public static void main(String[] args) {
                    Scanner sc=new Scanner(System.in);
                    System.out.println("Enter Pool Length");
                    double length = sc.nextDouble();
                    System.out.println("Enter Pool Width");
                    double width = sc.nextDouble();
                    System.out.println("Enter Pool Depth");
                    double depth = sc.nextDouble();
                    
                    double cleaning = 75;
                    double filling;
                    double volume = length*width*depth;
                    System.out.println("Volume of pool in cubic foot/feet = "+volume);
                    volume =volume*7.5; //in gallons
                    System.out.println("Volume in gallons = "+volume);
                    double time = volume/50;
                    System.out.println("Time to fill "+volume+" gallons in "+time+" minutes");
                    filling = (time*8)/60;//per hour rate to fill y gallons volume
                    System.out.println("Total pay of filling of "+volume+" in "+time+"minutes"+" is = "+filling);
                    System.out.println("Total Fee of both cleaning pool & filling pool = "+(cleaning+filling));
                    sc.close();
          }
}
