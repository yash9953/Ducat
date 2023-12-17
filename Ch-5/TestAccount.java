package Ducat;

class CheckingAccount{
          int accno;
          double balance;
          CheckingAccount(int a,double balance){
                    accno = a;
                    if(balance<200.00){
                              this.balance = 0;
                              System.out.println("If balance is lower than 200.00 it become 0.");
                    }else{
                              this.balance = balance;
                    }
          }
          public void display(){
                    System.out.println("Account Number : "+accno);
                    System.out.println("Balance : "+balance);
          }
}

public class TestAccount {
          public static void main(String[] args) {
                    CheckingAccount c1 =new CheckingAccount(123, 10000);
                    c1.display();
                    System.out.println();
                    CheckingAccount c2=new CheckingAccount(124, 199);
                    c2.display();
          }
}
