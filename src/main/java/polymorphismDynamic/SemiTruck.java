package polymorphismDynamic;

public class SemiTruck extends Vehicle{
    @Override
    //so for best practice we have to do over
    public void Brakes(){
        System.out.println("this vehicle use air-brakes");
    }
    public void speed(){

        System.out.println("this car is so fast ");
    }
}
