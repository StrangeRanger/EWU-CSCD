/** Abstract factory class for ShapeFactory and RoundedShapeFactory to extend. */
public interface AbstractFactory {
    // Requires that subclasses implement getShape.
    Shape getShape(String shapeType);
}
