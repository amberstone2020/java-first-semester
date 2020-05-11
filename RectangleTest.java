package firstsemester;

/*
 * Amber Stone
 * 11.10.19
 * Description: Test class for rectangle, with specs outlined in comments below.
 */
public class RectangleTest {

    public static void main(String[] args) {
        //rectangle object called rectangle1 with width 4.0 and height 40.0
        Rectangle rectangle1 = new Rectangle(4.0, 40.0);
        //display width, height, area, and perimeter of the rectangle1 object
        System.out.println("Rectangle 1 with a width of "
                + rectangle1.width + " and a height of "
                + rectangle1.height + " has an area of "
                + rectangle1.getArea() + " and a perimeter of "
                + rectangle1.getPerimeter());
        //rectangle object called rectangle2 with width 3.5 and height 35.9
        Rectangle rectangle2 = new Rectangle(3.5, 35.9);
        //display width, height, area, and perimeter of the rectangle2 object
        System.out.println("Rectangle 2 with a width of "
                + rectangle2.width + " and height of "
                + rectangle2.height + " has an area of " + rectangle2.getArea()
                + " and a perimeter of: " + rectangle2.getPerimeter());
    }
}
