package Polymorphism;

public class Car extends Vehicle {
@Override
    public void park(){
        System.out.println("I am a car and i am parked ");
    }
    @Override
    public void go(){
        System.out.println("Fast And luxury");
    }
}
