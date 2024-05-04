package polymorphismDynamic;

import java.util.Scanner;

public class MyShowRoom {
    public static void main(String[] args) {
//let's create an instant of scanner
        Scanner src = new Scanner(System.in);
        //get object of the vehicle
        Vehicle vehicle;

        System.out.println("Welcome to my dealership");
        System.out.println("(1=supercar) or (2=pickup truck) or (3=semi truck)");
        //here we have to enter integer so int choice to add it later on my terminal
        int choice = src.nextInt();
        //so what do we have here so far vehicle ,but we don't know yet what kind shape.. ask question here so what do we need to use here , so it's an IF condition here
        if (choice==1 ){
            //we are creating a new object
            vehicle= new SuperCars();
            vehicle.Brakes();
            vehicle.speed();


        }  else if (choice==2){
            vehicle= new PickupTruck();
            vehicle.speed();
            vehicle.Brakes();


        }  else if (choice==3 ){
            vehicle= new SemiTruck();
vehicle.Brakes();
vehicle.speed();
        }else{
            System.out.println("only vehicles here");
        }
        //we have to add this after you done with dynamic overloading they take exact same name with diff paramters 
        SuperCars ferrari = new SuperCars();
        //ferrari.speed(12);
    }
}

/**
 *  so that's one of the benefits of dynamic polymorphism you can declare an object and make space for it.
 * // even you don't know what type of object do you want or what kind of vehicle you are going to buy from me
 * here another example for dynamic polymorphism like pokemon old game you have to choice boy or girl or you playing street fighter game
 * all of them are avatars part of the game but diffrent
 */
