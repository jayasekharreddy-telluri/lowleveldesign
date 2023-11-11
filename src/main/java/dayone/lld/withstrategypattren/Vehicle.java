package dayone.lld.withstrategypattren;

import dayone.lld.withstrategypattren.strategy.DriveStrategy;

public class Vehicle {

    DriveStrategy driveStrategy;


    //constructor injection

    Vehicle(DriveStrategy driveStrategy) {
        this.driveStrategy = driveStrategy;
    }


    Vehicle() {
    }



    public void drive(){
        driveStrategy.drive();
    }

    public static void main(String[] args) {

        Vehicle vs = new SportsVehicle();

        Vehicle vp = new PassenegerVehicle();



        vs.drive();

        vp.drive();

    }
}
