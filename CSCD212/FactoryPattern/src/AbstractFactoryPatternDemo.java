// *************************************************************************************
//
// Name: 		Hunter T.
// Course:		CSCD 212
// Description: Utilize the Abstract Factory Pattern to implement two shape factories;
// 				one regular and one rounded. These factories will handle creating shapes
// 				for the client.
//
// *************************************************************************************

public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        // Declare FactoryProducer and it will route us to the corresponding factory
        // and pass the information of shapeType.
        FactoryProducer factoryProducer = new FactoryProducer();

        // Get normal square and draw it.
        Shape shapeOne = factoryProducer.getFactory("SQUARE");
        shapeOne.draw();

        // Get normal rectangle and draw it.
        Shape shapeTwo = factoryProducer.getFactory("RECTANGLE");
        shapeTwo.draw();

        // Get rounded rectangle and draw it.
        Shape shapeThree = factoryProducer.getFactory("ROUNDEDRECTANGLE");
        shapeThree.draw();

        // Get rounded square and draw it.
        Shape shapeFour = factoryProducer.getFactory("ROUNDEDSQUARE");
        shapeFour.draw();
    }
}
