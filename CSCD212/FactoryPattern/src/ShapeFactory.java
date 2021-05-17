public class ShapeFactory implements AbstractFactory {
    /** Use getShape method to get object of type shape */
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            // This produces a NullPointerException.
            return null;
        }

        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }

        // This produces a NullPointerException.
        return null;
    }
}
