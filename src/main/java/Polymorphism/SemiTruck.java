package Polymorphism;

public class SemiTruck extends Vehicle {
@Override
    public void park(){
        System.out.println("Semi Truck is parked  ");
    }
    @Override
    public void go(){
        System.out.println("semi truck is moving ");
    }
}
