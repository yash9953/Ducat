package DucatOOps;

class Vehicle {
          private int nwheel;
          private int avgmpg;

          Vehicle(int n, int avg) {
                    nwheel = n;
                    avgmpg = avg;
          }

          public int getnumofwheels() {
                    return nwheel;
          }

          public int getavgmpg() {
                    return avgmpg;
          }

          void display() {
                    System.out.println("Total wheels-> " + nwheel);
                    System.out.println("Average number of miles per gallon-> " + avgmpg);
          }
}

class Car extends Vehicle {
          Car(int nwheel, int avgmpg) {
                    super(4, avgmpg);
          }

          void display() {
                    super.display();
          }
}

class MotorCycle extends Vehicle {
          MotorCycle(int nwheel, int avgmpg) {
                    super(2, avgmpg);
          }

          void display() {
                    super.display();
          }
}

public class UseVehicle {
          public static void main(String[] args) {
                    Vehicle v =new Vehicle(0, 90);
                    Car car = new Car(25, 150);
                    MotorCycle motor = new MotorCycle(30,120);
                    System.out.println("-------------------------Vehicle--------------------------");
                    v.display();
                    System.out.println("-------------------------Car--------------------------");
                    car.display();
                    System.out.println("-------------------------motorcycle-------------------");
                    motor.display();
          }
}
