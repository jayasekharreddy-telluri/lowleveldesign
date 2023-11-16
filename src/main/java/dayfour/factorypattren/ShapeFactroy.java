package dayfour.factorypattren;

public class ShapeFactroy {

    Shape getShape(String input) {

        switch (input) {
            case "CIRCLE":
                return new Circle();
            case "RECTNGLE":
                return new Rectangle();
            default:
                return null;
        }
    }
}
