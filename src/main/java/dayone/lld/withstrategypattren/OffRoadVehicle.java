package dayone.lld.withstrategypattren;

import dayone.lld.withstrategypattren.strategy.DriveStrategy;

public class OffRoadVehicle extends Vehicle {
    public OffRoadVehicle() {

        super((DriveStrategy) new SportsVehicle());
    }
}
