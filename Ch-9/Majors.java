package Ducat;

import java.util.Scanner;

public class Majors {
          enum Major {
                    ACC("Business Division"), CHEM("Science Division"), CIS("Business Division"),
                    ENG("Humanities Division"), HIS("Humanities Division"), PHYS("Science Division");

                    private String division;

                    Major(String division) {
                              this.division = division;
                    }

                    public String getDivision() {
                              return division;
                    }
          }

          public static void main(String[] args) {
                    Scanner sc = new Scanner(System.in);
                    System.out.println("The following majors are offered by the college:");
                    for (Major major : Major.values()) {
                              System.out.println(major);
                    }
                    System.out.print("\nEnter a major: ");
                    String userMajor = sc.nextLine().toUpperCase();
                    for (Major major : Major.values()) {
                              if (major.name().equals(userMajor)) {
                                        System.out.println("This major falls under the " + major.getDivision() + ".");
                                        return;
                              }
                    }
                    sc.close();
          }
}