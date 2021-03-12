// *************************************************************************************
//
// Name:        Hunter T.
// Date:        January 22, 2021
// Class:       CSCD 211
// Description: Finds the area and perimeter of a rectangle with a given width and
//              height.
//
// *************************************************************************************

public class CSCD211_Ch0901_RectangleClass {
    /** Main method. */
    public static void main(String[] args) {
        // Create a rectangle with a width of 4 and a height of 40.
        Rectangle rectangleOne = new Rectangle(4, 40);
        System.out.println("The area of a rectangle with a width of 4.0 and "
                           + "a height of 40.0 is " + rectangleOne.getArea());
        System.out.println("The perimeter of the rectangle is "
                           + rectangleOne.getPerimeter());

        // Create a rectangle with a width of 3.5 and a height of 35.9.
        Rectangle rectangleTwo = new Rectangle(3.5, 35.9);
        System.out.println("The area of a rectangle with a width of 3.5 and "
                           + "a height of 35.9 is " + rectangleTwo.getArea());
        System.out.println("The perimeter of the rectangle is "
                           + rectangleTwo.getPerimeter());
    }
}

class Rectangle {
    double width, height;

    /** Construct a rectangle with a height and width of 1. */
    Rectangle() {
        width  = 1;
        height = 1;
    }

    /** Construct a rectangle with a specified width and height. */
    Rectangle(double newWidth, double newHeight) {
        width  = newWidth;
        height = newHeight;
    }

    /** Return the area of this rectangle. */
    double getArea() {
        return width * height;
    }

    /** Return the perimeter of this rectangle. */
    double getPerimeter() {
        return ((width * 2) + (height * 2));
    }
}
