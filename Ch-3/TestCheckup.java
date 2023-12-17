package Ducat;

import java.util.Scanner;

class Checkup {
          // bp={systolic , diastolic}
          // cf ={HDL/LDL}
          private int patient_number, systolic_bp, diastolic_bp, ldl_cholesterol, hdl_cholesterol;

          public Checkup(int patientNumber, int systolicBP, int diastolicBP, int ldlCholesterol, int hdlCholesterol) {
                    this.patient_number = patientNumber;
                    this.systolic_bp = systolicBP;
                    this.diastolic_bp = diastolicBP;
                    this.ldl_cholesterol = ldlCholesterol;
                    this.hdl_cholesterol = hdlCholesterol;
          }

          public void setpatientnum(int n) {
                    patient_number = n;
          }

          public void setsystolicbp(int n) {
                    systolic_bp = n;
          }

          public void setdiastolicbp(int n) {
                    diastolic_bp = n;
          }

          public void setldlcholesterol(int n) {
                    ldl_cholesterol = n;
          }

          public void sethdlcholesterol(int n) {
                    hdl_cholesterol = n;
          }

          public int getpatientnum() {
                    return patient_number;
          }

          public int getsystolicbp() {
                    return systolic_bp;
          }

          public int getdiastoliccbp() {
                    return diastolic_bp;
          }

          public int getldlcholesterol() {
                    return ldl_cholesterol;
          }

          public int gethdlcholesterol() {
                    return hdl_cholesterol;
          }

          public double computeRatio() {
                    return (double) ldl_cholesterol / hdl_cholesterol;
          }

          public void explainRatio() {
                    System.out.println("HDL is known as \"good cholesterol\". A ratio of 3.5 or lower is considered optimum.");
          }
}

public class TestCheckup {
          public static void main(String[] args) {
                    Checkup checkup1 = getData();
                    Checkup checkup2 = getData();
                    Checkup checkup3 = getData();
                    Checkup checkup4 = getData();

                    showValues(checkup1);
                    showValues(checkup2);
                    showValues(checkup3);
                    showValues(checkup4);
          }

          public static Checkup getData() {
                    Scanner scanner = new Scanner(System.in);

                    System.out.print("Enter patient number: ");
                    int patientNumber = scanner.nextInt();

                    System.out.print("Enter systolic blood pressure: ");
                    int systolicBP = scanner.nextInt();

                    System.out.print("Enter diastolic blood pressure: ");
                    int diastolicBP = scanner.nextInt();

                    System.out.print("Enter LDL cholesterol: ");
                    int ldlCholesterol = scanner.nextInt();

                    System.out.print("Enter HDL cholesterol: ");
                    int hdlCholesterol = scanner.nextInt();
                    scanner.close();
                    return new Checkup(patientNumber, systolicBP, diastolicBP, ldlCholesterol, hdlCholesterol);
          }

          public static void showValues(Checkup checkup) {
                    System.out.println("Patient number: " + checkup.getpatientnum());
                    System.out.println("Blood pressure: " + checkup.getsystolicbp() + "/" + checkup.getdiastoliccbp());
                    System.out.println("LDL cholesterol: " + checkup.getldlcholesterol());
                    System.out.println("HDL cholesterol: " + checkup.gethdlcholesterol());
                    System.out.println("Cholesterol ratio: " + checkup.computeRatio());
                    checkup.explainRatio();
          }
}
