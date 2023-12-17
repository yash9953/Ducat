package Ducat;

import java.util.Scanner;

public class Pay {
          public static void main(String[] args) {
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Enter Skill level from 1 to 3");
                    int skill_level = sc.nextInt();
                    int hour_work, insurance_option;

                    System.out.println("Enter Number of hours work");
                    hour_work = sc.nextInt();
                    if (skill_level == 1) {
                              System.out.println("Your total worked hours : " + hour_work);
                              System.out.println("Your Hourly Par Rate is : 17.00");
                              System.out.println("Regular Pay for 40 hours is : " + 40 * 17);
                              if (hour_work > 40) {
                                        System.out.println("Overtime pay for " + (hour_work - 40) + " hours is "
                                                            + (hour_work - 40) * 17);
                              }
                              System.out.println("Total Salary : " + hour_work * 17);
                    } else if (skill_level == 2) {
                              System.out.println("Your total worked hours : " + hour_work);
                              System.out.println("Your Hourly Par Rate is : 20.00");
                              System.out.println("Regular Pay for 40 hours is : " + 40 * 20);
                              if (hour_work > 40) {
                                        System.out.println("Overtime pay for " + (hour_work - 40) + " hours is "
                                                            + (hour_work - 40) * 20);
                              }
                              System.out.println("Total Salary : " + hour_work * 20);
                              System.out.println(">>>>>Congrats you are eligible to take insurance options<<<<");
                              System.out.println("Enter 1 for Medical Insurance cost per week = 32.50");
                              System.out.println("Enter 2 for Dental Insurance cost per week = 20.00");
                              System.out.println("Enter 3 for Long-term disability Insurance cost per week = 10.00");
                              insurance_option = sc.nextInt();
                              if (insurance_option == 1) {
                                        System.out.println("total itemized deduction : " + ((32.50) * 5));
                                        float netpay = (float) (hour_work * 20 - (32.50) * 5);
                                        if (netpay < 0) {
                                                  System.out.println("Error....");
                                        }
                                        System.out.println("Net Pay after all deduction = " + netpay);
                              } else if (insurance_option == 2) {
                                        System.out.println("total itemized deduction : " + (20 * 5));
                                        int netpay = hour_work * 20 - 20 * 5;
                                        if (netpay < 0) {
                                                  System.out.println("Error....");
                                        }
                                        System.out.println("Net Pay after all deduction = " + netpay);
                              } else if (insurance_option == 3) {
                                        System.out.println("total itemized deduction : " + (10 * 5));
                                        int netpay = hour_work * 20 - 10 * 5;
                                        if (netpay < 0) {
                                                  System.out.println("Error....");
                                        }
                                        System.out.println("Net Pay after all deduction = " + netpay);
                              } else {
                                        System.out.println("Invalid");
                              }
                    } 
                    else if(skill_level==3){
                              System.out.println("Your total worked hours : " + hour_work);
                              System.out.println("Your Hourly Par Rate is : 22.00");
                              System.out.println("Regular Pay for 40 hours is : " + 40 * 22);
                              if (hour_work > 40) {
                                        System.out.println("Overtime pay for " + (hour_work - 40) + " hours is "
                                                            + (hour_work - 40) * 22);
                              }
                              System.out.println("Total Salary : " + hour_work * 22);
                              System.out.println(">>>>>Congrats you are eligible to take insurance options<<<<<");
                              System.out.println("Enter 1 for Medical Insurance cost per week = 32.50");
                              System.out.println("Enter 2 for Dental Insurance cost per week = 20.00");
                              System.out.println("Enter 3 for Long-term disability Insurance cost per week = 10.00");
                              insurance_option = sc.nextInt();
                              if (insurance_option == 1) {
                                        System.out.println("total itemized deduction : " + ((32.50) * 5));
                                        float netpay = (float) (hour_work * 22 - (32.50) * 5);
                                        if (netpay < 0) {
                                                  System.out.println("Error....");
                                        }
                                        System.out.println("Net Pay after all deduction = " + netpay);
                              } else if (insurance_option == 2) {
                                        System.out.println("total itemized deduction : " + (20 * 5));
                                        int netpay = hour_work * 22 - 20 * 5;
                                        if (netpay < 0) {
                                                  System.out.println("Error....");
                                        }
                                        System.out.println("Net Pay after all deduction = " + netpay);
                              } else if (insurance_option == 3) {
                                        System.out.println("total itemized deduction : " + (10 * 5));
                                        int netpay = hour_work * 22 - 10 * 5;
                                        if (netpay < 0) {
                                                  System.out.println("Error....");
                                        }
                                        System.out.println("Net Pay after all deduction = " + netpay);
                              } else {
                                        System.out.println("Invalid");
                              }
                    }else{
                              System.out.println("Invalid Skill Level");
                    }
                    sc.close();
          }
}
