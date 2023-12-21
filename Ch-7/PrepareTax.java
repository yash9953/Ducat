package Ducat;

import java.util.Scanner;

class TaxReturn{
          int zipcode;
          String securitynum,fname,lname,streetadd,city,state,maritalstatus;
          double annualincome,taxliability;
          TaxReturn(String securitynum,int zipcode,String fname,String lname,String streetadd,String city,String state,String maritalstatus,double income){
                    this.securitynum = securitynum;
                    this.zipcode = zipcode;
                    this.fname = fname;
                    this.lname = lname;
                    this.streetadd = streetadd;
                    this.city = city;
                    this.state = state;
                    this.maritalstatus = maritalstatus;
                    annualincome = income;
                    if(annualincome>=0&&annualincome<=20000){
                              if(maritalstatus.equals("Single")||maritalstatus.equals("single")){
                                        taxliability = (annualincome*15)/100;
                              }
                              else{
                                        taxliability = (annualincome*14)/100;
                              }
                    }
                    else if(annualincome>=20001&&annualincome<=50000){
                              if(maritalstatus.equals("Single")||maritalstatus.equals("single")){
                                        taxliability = (annualincome*22)/100;
                              }
                              else{
                                        taxliability = (annualincome*20)/100;
                              }
                    }
                    else if(annualincome>=50001){
                              if(maritalstatus.equals("Single")){
                                        taxliability = (annualincome*30)/100;
                              }
                              else{
                                        taxliability = (annualincome*28)/100;
                              }
                    }
          }
          void display(){
                    System.out.println("----------------------------------------------");
                    System.out.println("Name -> "+fname+" "+lname);
                    System.out.println("Security number -> "+securitynum);
                    System.out.println("Zip Code -> "+zipcode);
                    System.out.println("Address -> "+streetadd+" "+city+" "+state);
                    System.out.println("Annual Income -> "+annualincome);
                    System.out.println("MaritalStatus -> "+maritalstatus);
                    System.out.println("Tax Liablity -> "+taxliability);
                    System.out.println("------------------------------------------------");
          }
}

public class PrepareTax {
          public static void main(String[] args) {
                    Scanner sc=new Scanner(System.in);
                    System.out.println("Enter First name");
                    String fname = sc.next();
                    System.out.println("Enter Last name");
                    String lname = sc.next();
                    String snum = "";
                    while(true){
                              System.out.println("Enter security number in format 999-99-99999");
                              snum = sc.next();
                              if(snum.charAt(3)=='-'&&snum.charAt(6)=='-'){
                                        break;
                              }
                    }
                    int zipcode;
                    while(true){
                              System.out.println("Enter Zip Code");
                              zipcode = sc.nextInt();
                              int c = 0,k = zipcode;
                              while (k!=0) {
                                        c++;
                                        k/=10;
                              }
                              if(c==5){
                                        break;
                              }
                    }
                    System.out.println("Enter Street address");
                    sc.nextLine();
                    String street = sc.nextLine();
                    System.out.println("Enter City");
                    String city = sc.next();
                    System.out.println("Enter State");
                    sc.nextLine();
                    String state = sc.nextLine();
                    String mstatus = "";
                    while(true){
                              System.out.println("Enter Marital Status");
                              mstatus = sc.next();
                              if(mstatus.charAt(0)=='m'||mstatus.charAt(0)=='s'||mstatus.charAt(0)=='M'||mstatus.charAt(0)=='S'){
                                        break;
                              }
                    }
                    double income;
                    while (true) {
                              System.out.println("Enter Income");
                              income = sc.nextDouble();
                              if(income>=0){
                                        break;
                              }
                    }
                    //create object
                    TaxReturn t =new TaxReturn(snum, zipcode, fname, lname, street, city, state, mstatus, income);
                    t.display();
                    sc.close();
          }
}
