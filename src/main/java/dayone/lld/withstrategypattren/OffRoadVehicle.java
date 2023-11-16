package dayone.lld.withstrategypattren;

import dayone.lld.withstrategypattren.strategy.DriveStrategy;
import dayone.lld.withstrategypattren.strategy.NormalDriveStrategy;

public class OffRoadVehicle extends Vehicle {
    public OffRoadVehicle() {

        super(new NormalDriveStrategy());
    }
}
