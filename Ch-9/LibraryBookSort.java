package Ducat;

import java.util.ArrayList;
import java.util.Scanner;

class LibraryBook {
          String title, author;
          int page;

          LibraryBook(String title, String author, int page) {
                    this.title = title;
                    this.author = author;
                    this.page = page;
          }

          void settitle(String t) {
                    title = t;
          }

          void setauthor(String a) {
                    author = a;
          }

          void setpage(int p) {
                    page = p;
          }

          String gettitle() {
                    return title;
          }

          String getauthor() {
                    return author;
          }

          int getpage() {
                    return page;
          }
}

public class LibraryBookSort {
          public static void main(String[] args) {
                    Scanner sc = new Scanner(System.in);
                    ArrayList<LibraryBook> list = new ArrayList<>();
                    System.out.println("Enter 5 book details");
                    for (int i = 1; i <= 5; i++) {
                              if (i == 1) {
                                        System.out.println("{Enter " + i + "st book details}");
                              }
                              if (i == 2) {
                                        System.out.println("{Enter " + i + "nd book details}");
                              }
                              if (i == 3) {
                                        System.out.println("{Enter " + i + "rd book details}");
                              }
                              if (i > 3) {
                                        System.out.println("{Enter " + i + "th book details}");
                              }
                              System.out.println("--------------------Enter Book-title name----------------");
                              String title = sc.nextLine();
                              System.out.println("---------------------Enter author name--------------------");
                              String author = sc.nextLine();
                              System.out.println("---------------------Enter number of pages----------------");
                              int page = sc.nextInt();
                              sc.nextLine();
                              LibraryBook b = new LibraryBook(title, author, page);
                              list.add(b);
                    }

                    for (LibraryBook b : list) {
                              System.out.println(b.gettitle() + "<->" + b.getauthor() + "<->" + b.getpage());
                    }
                    sc.close();
          }
}
