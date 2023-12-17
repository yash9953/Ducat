package Ducat;

class Household{
          int no_of_occupation;
          float annual_income;
          Household(){
                    no_of_occupation = 1;
                    annual_income = 0;
          }
          void setoccupation(int n){
                    no_of_occupation = n;
          }
          void setincome(float n){
                    annual_income = n;
          }
          int getoccupation(){
                    return no_of_occupation;
          }
          float getincome(){
                    return annual_income;
          }
          Household(int occupation){
                    no_of_occupation = occupation;
                    System.out.println("In 1-parameterized constructor");
          }
          Household(int occupation,float income){
                    no_of_occupation = occupation;
                    annual_income = income;
          }
          void display(){
                    System.out.println("Occupation"+ no_of_occupation);
                    System.out.println("Income : "+annual_income);
          }
}

public class TestHousehold {
          public static void main(String[] args) {
                    Household h1 = new Household();
                    System.out.println(h1.getoccupation());
                    System.out.println(h1.getincome());
                    System.out.println();
                    Household h2 = new Household(2);
                    System.out.println(h2.getoccupation());
                    System.out.println(h2.getincome());
                    System.out.println();
                    Household h3 = new Household(2,10000);
                    System.out.println(h3.getoccupation());
                    System.out.println(h3.getincome());
          }
}
