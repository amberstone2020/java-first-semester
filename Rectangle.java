package firstsemester;

/*
 * Amber Stone
 * 11.10.19
 * Description: This program designs a class called Rectangle to represent a 
 * rectangle. The class contains the specs outlined in the comments below.
 */
public class Rectangle {

    //instance variable for height
    public double width = 1;
    //instance variable for height
    public double height = 1;

    //no-argument constructor that creates a default rectangle
    public Rectangle() {

    }

    //constructor that creates a rectangle with the specified width and height
    public Rectangle(double newWidth, double newHeight) {
        width = newWidth;
        height = newHeight;

    }

    //method named getArea() that returns the area of the rectangle
    public double getArea() {
        return width * height;
    }

    //method named getPerimeter() that returns the perimeter
    public double getPerimeter() {
        return 2 * (width + height);
    }
}
