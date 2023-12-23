package DucatOOps;

import java.util.Scanner;

class CollegeCourse {
          String id;
          int credit_hours;
          char grade;
          CollegeCourse(String id,int hour,char g){
                    this.id= id;
                    credit_hours = hour;
                    grade = g;
          }
          void setid(String id) {
                    this.id = id;
          }

          void sethours(int h) {
                    credit_hours = h;
          }

          void setgrade(char c) {
                    grade = c;
          }

          String getid() {
                    return id;
          }

          int gethours() {
                    return credit_hours;
          }

          char getgrade() {
                    return grade;
          }
}

class Student {
          int id;
          CollegeCourse course[];
          Student(int id){
                    this.id = id;
                    this.course =new CollegeCourse[5];
          }
          void setid(int id) {
                    this.id = id;
          }

          int getid() {
                    return id;
          }

          CollegeCourse getcourse(int i) {
                    return course[i];
          }

          void setcourse(int i,CollegeCourse coursename) {
                    course[i] = coursename;
          }
}

public class InputGrades {
          public static void main(String[] args) {
                    final int NUM_STUDENTS = 10;
                    final int NUM_COURSES = 5;

                    Scanner sc = new Scanner(System.in);

                    Student[] students = new Student[NUM_STUDENTS];

                    for (int i = 0; i < NUM_STUDENTS; i++) {
                              System.out.print("Enter ID for student #" + (i + 1) + ": ");
                              int studentId = sc.nextInt();
                              sc.nextLine();

                              Student student = new Student(studentId);

                              for (int j = 0; j < NUM_COURSES; j++) {
                                        System.out.print("Enter course ID #" + (j + 1) + ": ");
                                        String courseId = sc.nextLine();

                                        System.out.print("Enter credit hours: ");
                                        int creditHours = sc.nextInt();
                                        sc.nextLine();

                                        System.out.print("Enter grade: ");
                                        char grade = sc.nextLine().charAt(0);

                                        CollegeCourse course = new CollegeCourse(courseId, creditHours, grade);
                                        student.setcourse(j, course);
                              }
                              students[i] = student;
                    }
                    sc.close();
          }
}
