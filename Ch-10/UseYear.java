package DucatOOps;

class Year{
          int days;
          Year(){
                    days = 365;
          }
          int getday(){
                    return days;
          }
          void setday(int i){
                    days = i;
          }
}
class LeapYear extends Year{
          LeapYear(){
                    super();
                    setday(366);
          }
}

public class UseYear {
          public static void main(String[] args) {
                    Year y =new Year();
                    LeapYear l =new LeapYear();
                    System.out.println("Days in a year = "+y.getday());
                    System.out.println("Days in a leap year = "+l.getday());
          }
}
