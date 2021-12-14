//Add class comment and @ tags
/**
 * This class models a square.
 *
 * @author Austin Walley
 * @version 10/17/21
 */

public class Square extends Parallelogram
{
    /**
     * Constructor that takes an integer side length
     * @param side of Square
     */
    public Square(int side) 
    {
        super(side, side);
    }
  
    /**
     * Abstract method from the superclass that takes no param and returns area of square.
     * @return area of Square
     */    
    public int getArea() 
    {
        return getArea(getLength(), getLength()); // calls helper recursive method to return area
    }
  
    /**
     * Computes area of square.
     * @return area of Square
     */
    private int getArea(int side, int n) 
    {
        if(side <= 0 || n <= 0) // side or n is less than 0, return 0
        {
            return 0;
        }
        else if(n == 0 || side == 0) // base case: n or side is 0, return 0
        {
            return 0;
        }
        else
        {
            return side + getArea(side, n-1);
        }
    }
}
