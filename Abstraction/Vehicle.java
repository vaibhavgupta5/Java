package Abstraction;

abstract public class Vehicle {

    int tyres;

    void commonFeatures() {
        System.out.println("Common features of vehicles");
    }

    abstract void stop();

    public static void main(String[] args) {
        
    }
}
