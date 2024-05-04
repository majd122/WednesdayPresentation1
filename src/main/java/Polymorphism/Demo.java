package Polymorphism;

public class Demo {
    public static void main(String[] args) {
       SemiTruck semiTruck=new SemiTruck();
       Truck truck= new Truck();
       Car car=new Car();
       //Car []parkingLot ={car,truck,bicycle}; try one by one to show that you cant accept the one you call
       Vehicle []parking ={car,truck,semiTruck};
    for (Vehicle v :parking){
        v.park();
    }

    }
}
