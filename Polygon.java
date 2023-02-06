import java.text.DecimalFormat;
/**
 * @file Polygon.java
 * @date 2/5/2023
 * @author Caroline Nielsen
 *
 * * @description Uses the number of sides, side lengths, and shape type to create a polygon or determine if it is invalid
 */
public class Polygon {

    private int ns;
    private double sl;
    private String st;
    private double perimeter = ns * sl;

    /**
     * @return default constructor
     */
    
    public Polygon() {
        ns = 3;
        sl = 1.0;
        st = "triangle";
        perimeter = ns * sl;
    }
    
    /**
     * @return constructor with 3 parameters that creates a polygon
     */
    
    public Polygon(int numSides, double sideLength, String shapeType) {
        ns = numSides;
        sl = sideLength;
        st = shapeType;
        perimeter = ns * sl;
    }

    /**
     * @return the number of sides
     */

    public double getNumSides() {
        return ns;
    }

    /**
     * @return the side length
     */

    public double getSideLength() {
        return sl;
    }

    /**
     * @return the perimeter of the shape
     */
    public double getPerimeter(){
        return perimeter;
    }

    /**
     * @return the shape type
     */

    public String getShapeType() {
        return st;
    }
    
    /**
     * @return returns if the polygon is invalid, or returns information about the polygon
     */
    
    public String toString() {
        DecimalFormat df = new DecimalFormat("#.##");
        if (sl <= 0 || ns < 3) {
            return "Not a valid polygon";
        }
            else{
                return "Your shape is a " + st + " and it has " + df.format(ns) + " sides. It has a side length of " + df.format(sl) + ". It has a perimeter of " + df.format(perimeter) + " units.";
            }
        }
}
