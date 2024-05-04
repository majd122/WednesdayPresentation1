package Inheritance;

public class Vehicle {
    String brand;
    // void options(){} i first show myself without and then add parameters
//question why I  don't have complaint and my code is happy ??
    //cause we do have parameters (double howFast,int doors )


  void options(double howFast,int doors){
        System.out.println("this vehicle is running ");
        System.out.println("this car is "+howFast+" mph and doors are : "+doors);
    }
    void price(double value ){
       double tax=value*0.06;
       double afterTax=value+tax;
        System.out.println("this vehicle price is : $"+value + "and the price after tax is : $"+afterTax);
    }
}
