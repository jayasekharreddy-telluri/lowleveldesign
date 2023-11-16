package dayfour.factorypattren;

public class Main {

    public static void main(String[] args) {

        ShapeFactroy s = new ShapeFactroy();

        Shape newShape = s.getShape("RECTNGLE");
        newShape.draw();

        Shape newShapee = s.getShape("CIRCLE");
        newShapee.draw();


    }
}
