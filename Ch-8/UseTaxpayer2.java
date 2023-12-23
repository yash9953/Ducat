package Ducat;

class Taxpayer{
          int  yearly_gross_income;
          int social_securitynum;
          Taxpayer(int i,int n){
                    yearly_gross_income = i;
                    social_securitynum = n;
          }
          void setincome(int i){
                    yearly_gross_income = i;
          }
          void setsecuitynum(int n){
                    social_securitynum = n;
          }
          int getincome(){
                    return yearly_gross_income;
          }
          int getsecuritynum(){
                    return social_securitynum;
          }
}

public class UseTaxpayer2 {
          public static void main(String[] args) {
                    Taxpayer a[]=new Taxpayer[10];
                    for(int i=0;i<a.length;i++){
                              a[i] = new Taxpayer(10000*(i+1),i+1);
                    }
                    for(int i=0;i<a.length;i++){
                              System.out.println(a[i].getincome()+" "+a[i].getsecuritynum());
                    }
          }
}
