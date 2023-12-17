package Ducat;

class Student {
          int id, credit_hour, points;
          Student(){
                    id = 9999;
                    points = 12;
                    credit_hour = 3;
          }
          Student(int id, int c, int p) {
                    this.id = id;
                    credit_hour = c;
                    points = p;
          }
          public void setid(int i) {
                    id = i;
          }
          public int getid() {
                    return id;
          }
          public void setcredit_hour(int c) {
                    credit_hour = c;
          }
          public int getcredit_hour() {
                    return credit_hour;
          }
          public void setpoint(int p) {
                    points = p;
          }
          public int getpoint() {
                    return points;
          }
          public double getGradePointAverage() {
                    return (double) points / credit_hour;
          }
          public void showDetails() {
                    System.out.println("ID number: " + id);
                    System.out.println("Credit hours: " + credit_hour);
                    System.out.println("Points: " + points);
                    System.out.println("Grade point average: " + getGradePointAverage());
          }
}
public class ShowStudent2 {
          public static void main(String[] args) {
                    Student s1 =new Student();
                    s1.showDetails();
                    System.out.println();
                    Student s2 = new Student(9945, 40, 12);
                    s2.showDetails();
                    System.out.println();
                    Student s3 = new Student();
                    s3.setid(9449);
                    s3.setcredit_hour(34);
                    s3.setpoint(40);
                    s3.showDetails();
          }
}
