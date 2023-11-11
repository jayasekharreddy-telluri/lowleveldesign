package dayone.lld.withstrategypattren.strategy;

public class SportsDriveStrategy implements DriveStrategy{


    @Override
    public void drive() {
        System.out.println("sports strategy");
    }
}
