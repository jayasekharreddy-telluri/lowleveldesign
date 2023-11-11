package dayone.lld.lspproblem;

import java.util.ArrayList;
import java.util.List;

public class Vehicle {


    public int getVehicleWheels() {

        return 2;
    }

    public Boolean hasEngine() {

        return true;
    }

    public static void main(String[] args) {

        List<Vehicle> vehicleList = new ArrayList<>();

        vehicleList.add(new MotorCycle());

        vehicleList.add(new Car());

        // here we added bycle which doesnt have engine and returning null value which basically
        // changing the property of parent class vehicle
        // which giving error null pointer --> code is breaking here

        vehicleList.add(new Bicycle());


        for (Vehicle v : vehicleList) {

            System.out.println(v.hasEngine().toString());
        }
    }
}
