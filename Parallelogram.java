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

    public Parallelogram(int length, int width) 
    {
        if (length <= 0 || width <= 0)
        {
            throw new IllegalArgumentException("less than or equal to 0");
        }
        this.length = length;
        this.width = width;
    }

    public final int getLength() 
    {
        return length;
    }
    
    public final int getWidth() 
    {
        return width;
    }

    abstract public int getArea();
}
