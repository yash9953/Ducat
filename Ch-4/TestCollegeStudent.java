package Ducat;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

class CollegeStudent {
          String first_name, last_name;
          LocalDate enrollmenDate, projectedgraduationDate;

          CollegeStudent() {
          }

          CollegeStudent(String fname, String lname, LocalDate enr) {
                    first_name = fname;
                    last_name = lname;
                    enrollmenDate = enr;
                    projectedgraduationDate = enrollmenDate;
                    projectedgraduationDate = projectedgraduationDate.plusYears(4);
          }

          public void setfirstname(String fname) {
                    first_name = fname;
          }

          public String getfirstname() {
                    return first_name;
          }

          public void setlastname(String lname) {
                    last_name = lname;
          }

          public String getlastname() {
                    return last_name;
          }

          public void setenrollmentDate(LocalDate l) {
                    enrollmenDate = l;
                    projectedgraduationDate = enrollmenDate;
                    projectedgraduationDate = projectedgraduationDate.plusYears(4);
          }

          public LocalDate getenrollmentDate() {
                    return enrollmenDate;
          }

          public LocalDate getprojectedgraduationdate() {
                    return projectedgraduationDate;
          }

          public void display() {
                    System.out.println("Hi " + first_name + " " + last_name);
                    System.out.println("Your enrollment date = " + enrollmenDate);
                    System.err.println("Your projected graduation date = " + projectedgraduationDate);
          }
}

public class TestCollegeStudent {
          public static void main(String[] args) {
                    Scanner sc = new Scanner(System.in);
                    CollegeStudent c1=new CollegeStudent("Yash", "Tyagi", LocalDate.now());
                    c1.display();
                    CollegeStudent c2 =new CollegeStudent();
                    System.out.println("Enter First Name");
                    String fname = sc.next();
                    System.out.println("Enter Last Name");
                    String lname = sc.next();
                    System.out.println("Enter Enrollment month");
                    System.out.print("Enter a Enrollment date (dd/mm/yyyy): ");
                    String dateStr = sc.next();
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                    LocalDate date = LocalDate.parse(dateStr, formatter);
                    c2.setfirstname(fname);
                    c2.setlastname(lname);
                    c2.setenrollmentDate(date);
                    c2.display();
                    sc.close();

          }
}
