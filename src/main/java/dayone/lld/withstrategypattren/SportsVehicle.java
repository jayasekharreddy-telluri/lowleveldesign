package dayone.lld.withstrategypattren;

import dayone.lld.withstrategypattren.strategy.SportsDriveStrategy;

public class SportsVehicle extends Vehicle {

    public SportsVehicle(){

        super(new SportsDriveStrategy());

    }

}
