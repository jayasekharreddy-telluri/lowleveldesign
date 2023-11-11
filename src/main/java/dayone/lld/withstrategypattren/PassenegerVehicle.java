package dayone.lld.withstrategypattren;

import dayone.lld.withstrategypattren.strategy.DriveStrategy;
import dayone.lld.withstrategypattren.strategy.NormalDriveStrategy;

public class PassenegerVehicle extends Vehicle {

    public PassenegerVehicle() {
        super(new NormalDriveStrategy());
    }
}
