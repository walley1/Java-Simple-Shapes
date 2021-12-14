/** 
 * This class models a rectangle.
 *
 * @author Austin Walley
 * @version 10/17/21
 */
public class Rectangle extends Parallelogram 
{

    public Rectangle(int length, int width) 
    {
        super(length, width);
    }
       
    public int getArea() 
    {
        return getArea(getLength(), getWidth()); 
    }
    
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
