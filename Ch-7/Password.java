package Ducat;

import java.util.Scanner;

public class Password {
          public static void main(String[] args) {
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Enter Password");
                    String password = "";
                    while (true) {
                              password = sc.next();
                              if (password.length() < 6 || password.length() > 10) {
                                        System.out.println("Inappropriate Password Please Re-enter");
                                        continue;
                              }
                              int c = 0, d = 0;
                              for (int i = 0; i < password.length(); i++) {
                                        char ch = password.charAt(i);
                                        if (ch >= 65 && ch <= 90 || ch >= 97 && ch <= 122) {
                                                  c++;
                                        }
                                        if (ch >= 48 && ch <= 57) {
                                                  d++;
                                        }
                              }
                              if (c == 0 || d == 0) {
                                        System.out.println("Inappropriate Password Please Re-enter");
                                        continue;
                              }
                              // statement below run only if password is correct typed
                              System.out.println("Re-enter password to verify.....");
                              String check = sc.next();
                              if (check.equals(password)) {
                                        System.out.println("Congrats Password is SAVED");
                                        break;
                              }
                              // below statement work until password is correctly checked
                              while (!check.equals(password)) {
                                        System.out.println("Error:Please re-enter same password");
                                        check = sc.next();
                              }
                              System.out.println("Congrats Password is SAVED");
                              break;
                    }
                    sc.close();
          }
}
