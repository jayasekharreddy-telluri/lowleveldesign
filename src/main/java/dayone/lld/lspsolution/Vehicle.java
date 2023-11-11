package dayone.lld.lspsolution;

import java.util.ArrayList;
import java.util.List;

public class Vehicle {


    public Integer getVehicleWheels() {

        return 2;
    }

    public static void main(String[] args) {

        List<Vehicle> vehicleList = new ArrayList<>();

        vehicleList.add(new MotorCycle());

        vehicleList.add(new Car());


        vehicleList.add(new Bicycle());


        for (Vehicle v : vehicleList) {

            //System.out.println(v.hasEngine().toString());

            System.out.println(v.getVehicleWheels().toString());
        }


        List<EngineVehicles> vehicleEngineList = new ArrayList<>();

        vehicleEngineList.add(new MotorCycle());

        vehicleEngineList.add(new Car());

        for (EngineVehicles ve : vehicleEngineList) {

            //System.out.println(v.hasEngine().toString());

            System.out.println(ve.hasEngine().toString());
        }
    }
}
