package DucatOOps;

import java.util.Scanner;

class CarRental {
          String name, carSize;
          int zipcode;
          int length_of_rental;
          double daily_rental_fee, total;

          public CarRental(String name, int zipcode, String carSize, double dailyRentalFee, int rentalDays) {
                    this.name = name;
                    this.zipcode = zipcode;
                    this.carSize = carSize;
                    this.length_of_rental = rentalDays;
                    this.daily_rental_fee = dailyRentalFee;
                    if (this.name.equalsIgnoreCase("economy")) {
                              daily_rental_fee = 29.99;
                    } else if (this.name.equalsIgnoreCase("midsize")) {
                              daily_rental_fee = 38.99;
                    } else if (this.name.equalsIgnoreCase("full size")) {
                              daily_rental_fee = 43.50;
                    }
                    total = daily_rental_fee * length_of_rental;
          }

          void display() {
                    System.out.println("Name-> " + name);
                    System.out.println("ZipCode-> " + zipcode);
                    System.out.println("length of rental in days-> " + length_of_rental);
                    System.out.println("daily rental fee-> " + daily_rental_fee);
                    System.out.println("total-> " + total);
          }
}

class LuxuryCarRental extends CarRental {
          String str;
          public LuxuryCarRental(String name, int zipcode, String carSize, int rentalDays) {
                    super(name, zipcode, carSize, 79.99, rentalDays);
                    System.out.println("Enter yes to add chauffeur in luxury car at $200 more per day");
                    Scanner sc = new Scanner(System.in);
                    str = sc.next();
                    sc.nextLine();
                    if (str.equalsIgnoreCase("yes")) {
                              total += 200;
                    }
          }

          @Override
          void display() {
                    super.display();
                    if(str.equalsIgnoreCase("yes")){
                              System.out.println("chauffeur fee-> $200");
                    }
          }
}

public class UseCarRental {
          public static void main(String[] args) {
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Enter renter's name:");
                    String renterName = sc.nextLine();
                    System.out.println("Enter zip code:");
                    int zipCode = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter car size (Economy/Midsize/Full Size):");
                    String carSize = sc.nextLine();
                    System.out.println("Enter rental days:");
                    int rentalDays = sc.nextInt();
                    sc.nextLine();

                    CarRental rental;
                    if (carSize.equalsIgnoreCase("Economy") || carSize.equalsIgnoreCase("Midsize")
                                        || carSize.equalsIgnoreCase("Full Size")) {
                              rental = new CarRental(renterName, zipCode, carSize, getDailyRentalFee(carSize),
                                                  rentalDays);
                    } else {
                              rental = new LuxuryCarRental(renterName, zipCode, carSize, rentalDays);
                    }
                    rental.display();
                    sc.close();
          }

          private static double getDailyRentalFee(String carSize) {
                    switch (carSize.toLowerCase()) {
                              case "economy":
                                        return 29.99;
                              case "midsize":
                                        return 38.99;
                              case "full size":
                                        return 43.50;
                              default:
                                        return 0.0;
                    }
          }
}
