package Abstraction;

public class Car extends Vehicle {

   void stop() {
       System.out.println("Car is stopping");
   }

    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.commonFeatures();
        myCar.stop();
    }
}
