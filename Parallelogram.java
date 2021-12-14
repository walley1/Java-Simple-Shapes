//Add class comment and @ tags
/** 
 * This abstract superclass is for a shape classified as a parallelogram
 *
 * @author Austin
 * @version 10/17/21
 */
public abstract class Parallelogram 
{
    private int length;
    private int width;

    /**
     * Constructor that takes a length and width as param.
     * @param length of Parallelogram
     * @param width of Parallelogram
     */
    public Parallelogram(int length, int width) 
    {
        if (length <= 0 || width <= 0)
        {
            throw new IllegalArgumentException("less than or equal to 0");
        }
        this.length = length;
        this.width = width;
    }

    /**
     * Accessor that gets the length of Parallelogram.
     * @return length of Parallelogram
     */
    public final int getLength() 
    {
        return length;
    }
    
    /**
     * Accessor to get the width of Parallelogram.
     * @return width of Parallelogram.
     */
    public final int getWidth() 
    {
        return width;
    }
    /**
     * Abstract method to calculate the area.
     * @return area of the shape.
     */
    abstract public int getArea();
}
