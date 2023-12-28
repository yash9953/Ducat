package DucatOOps;

class HotelRoom{
          public int room_num;
          public double nightly_rental_rate;
          HotelRoom(int room_num){
                    this.room_num=room_num;
                    if(room_num<=299){
                              nightly_rental_rate=69.95;
                    }else{
                              nightly_rental_rate=89.95;
                    }
          }
          public void setrentalrate(double r){
                    nightly_rental_rate=r;
          } 
          public int getroomnum(){
                    return room_num;
          }
          public double getrentalrate(){
                    return nightly_rental_rate;
          }
          public void display(){
                    System.out.println("Room Number : "+room_num);
                    System.out.println("Nightly Rental Rate : "+nightly_rental_rate);
          }
}
class Suite extends HotelRoom{
          double surcharge = 40;
          Suite(int room_num){
                    super(room_num);
                    if(room_num<=299){
                              setrentalrate(getrentalrate()+surcharge);
                    }
          }
}
public class UseHotellRoom {
          public static void main(String[] args) {
                    HotelRoom r =new HotelRoom(300);
                    System.out.println("Room Number : "+r.getroomnum()); 
                    System.out.println("Rental Rate : "+r.getrentalrate()); 
                    Suite s =new Suite(300);
                    System.out.println("Rental Rate for Suite: "+s.getrentalrate());
                    System.out.println("Room Number : "+s.getroomnum());
                    System.out.println();
                    
                    HotelRoom r2 =new HotelRoom(290);
                    System.out.println("Room Number : "+r2.getroomnum()); 
                    System.out.println("Rental Rate : "+r2.getrentalrate());
                    Suite s2 =new Suite(290);
                    System.out.println("Rental Rate for Suite: "+s2.getrentalrate());
                    System.out.println("Room Number : "+s2.getroomnum());
                    
          }
}
