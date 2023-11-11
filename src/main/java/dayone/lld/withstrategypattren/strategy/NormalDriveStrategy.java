package dayone.lld.withstrategypattren.strategy;

public class NormalDriveStrategy implements DriveStrategy{

    @Override
    public void drive() {
        System.out.println("normal strategy");
    }
}
