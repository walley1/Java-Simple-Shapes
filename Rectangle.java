//Add class comment and @ tags
/** 
 * This class models a rectangle.
 *
 * @author Austin Walley
 * @version 10/17/21
 */
public class Rectangle extends Parallelogram 
{
    /**
     * Constructor that takes length and width as param.
     * @param length of Rectangle
     * @param width of Rectangle
     */
    public Rectangle(int length, int width) 
    {
        super(length, width);
    }
    
    /**
     * Abstract method from the superclass that takes no param and returns area of rectangle.
     * @return area of Rectangle
     */    
    public int getArea() 
    {
        return getArea(getLength(), getWidth()); 
    }
    
    /**
     * Computes area of rectangle.
     * @return area of Rectangle
     */
    private int getArea(int length, int width) 
    {
        if (width <= 0 || length <= 0)
        {
            return 0;
        }
        else if (width == 0 || length == 0) //base case
        {
            return 0;
        }
        else
        {
            return length + getArea(length, width-1);
        }
    }
}
