import java.awt.*;

public class BigRectangleFilter implements Filter
{
    @Override
    public boolean accept(Object obj)
    {
        if (obj instanceof Rectangle)
        {
            Rectangle rect = (Rectangle) obj;
            int perimeter = 2 * (rect.width + rect.height);
            return perimeter > 10;
        }
        return false;
    }
}
