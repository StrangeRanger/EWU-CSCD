public class FactoryProducer {
    private RoundedShapeFactory roundedFactory = new RoundedShapeFactory();
    private ShapeFactory        shapeFactory   = new ShapeFactory();

    public Shape getFactory(String shapeType) {
        if (shapeType == null) {
        	// This produces a NullPointerException.
            return null;
        }

        if (shapeType.toLowerCase().contains("rounded")) {
        	return roundedFactory.getShape(shapeType);
        } else {
        	return shapeFactory.getShape(shapeType);
        }
    }
}
