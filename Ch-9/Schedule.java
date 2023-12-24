package Ducat;

import java.util.Scanner;

public class Schedule {
          public static void main(String[] args) {
                    Scanner sc = new Scanner(System.in);
                    String[][] courses = {
                                        { "CIS 110", "Th 3:30" },
                                        { "MAT 150", "Tu 1:30" },
                                        { "CIS 250", "WED 2:00" },
                                        { "PHY 300", "Th 1:00" },
                                        { "MAT 300", "MON 2:00" }
                    };
                    System.out.println("Please enter the name of your course to display the meeting time:");
                    String name = sc.nextLine();
                    boolean found = false;
                    for (int i = 0; i < courses.length; i++) {
                              if (name.equalsIgnoreCase(courses[i][0])) {
                                        found = true;
                                        System.out.println("The meeting is on " + courses[i][1]);
                                        break;
                              }
                    }
                    if (!found) {
                              System.out.println("Incorrect class name");
                    }
                    
                    // String arr[][] = new String[3][4];
                    // for (int i = 0; i < 4; i++) {
                    //           System.out.println("Enter course name");
                    //           arr[0][i] = sc.nextLine();
                    // }
                    // for (int i = 0; i < 4; i++) {
                    //           System.out.println("Enter meeting days as Mo/Tu/We/Th/Fr/Sa/Su");
                    //           arr[1][i] = sc.nextLine();
                    // }
                    // for (int i = 0; i < 4; i++) {
                    //           System.out.println("Enter times as (3:30) ");
                    //           arr[2][i] = sc.nextLine();
                    // }
                    // System.out.println("Enter course name");
                    // String course = sc.nextLine();
                    // for (int i = 0; i < 4; i++) {
                    //           if (arr[0][i].equals(course)) {
                    //                     System.out.println(arr[1][i] + " " + arr[2][i]);
                    //           }
                    // }

                    sc.close();
          }
}
