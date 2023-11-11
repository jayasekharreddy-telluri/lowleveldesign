package dayone.lld.withstrategypattren.strategy;

public class FutureXyzStrategy implements  DriveStrategy{


    @Override
    public void drive() {
        System.out.println("FutureXyzStrategy strategy");
    }
}
