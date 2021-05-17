public class RoundedShapeFactory implements AbstractFactory {
    /** Use getShape method to get object of type shape */
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            // This produces a NullPointerException.
            return null;
        }

        if (shapeType.equalsIgnoreCase("ROUNDEDCIRCLE")) {
            return new RoundedCircle();
        } else if (shapeType.equalsIgnoreCase("ROUNDEDRECTANGLE")) {
            return new RoundedRectangle();
        } else if (shapeType.equalsIgnoreCase("ROUNDEDSQUARE")) {
            return new RoundedSquare();
        }

        // This produces a NullPointerException.
        return null;
    }
}
