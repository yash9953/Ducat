package DucatOOps;

class Invoice{
          static int invoice_number,balance_due,day,year,month;
          Invoice(int n,int k,int d,int y,int m){
                    invoice_number = n;
                    balance_due = k;
                    day = d;
                    year = y;
                    month = m;
                    check(invoice_number,day,year,month);
          }
          public static void check(int n,int d,int y,int m){
                    if(n<1000){
                              invoice_number = 0;
                    }
                    if(d<1||d>31){
                              day = 0;
                    }
                    if(y<2011||y>2017){
                              day = 0;
                              month = 0;
                              year = 0;
                    }
                    if(m<1||m>12){
                              month = 0;
                              day = 0;
                              year = 0;
                    }
                    if(m==2){//28 days february months
                              if(day>28){
                                        day = 28;
                              }
                    }
                    if(m==4||m==6||m==9||m==11){//30 days months april,june,sep,nov
                              if(day==31){
                                        day = 30;
                              }
                    }
          }
          public void display(){
                    System.out.println("Invoice-number = "+invoice_number);
                    System.out.println("Balance Due = "+balance_due);
                    System.out.println("Date = "+day+"/"+month+"/"+year);
                    
          }
}

public class TestInvoice2 {
          public static void main(String[] args) {
                    Invoice i1=new Invoice(100, 15000, 31, 2011, 2);
                    i1.display();
          }
}
