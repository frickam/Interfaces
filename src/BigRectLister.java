import java.awt.Rectangle;
import java.util.ArrayList;

public class BigRectLister
{
    public static void main(String[] args)
    {
        ArrayList<Rectangle> rectangles = new ArrayList<>();

        rectangles.add(new Rectangle(1, 1, 1, 1)); // Perimeter = 4
        rectangles.add(new Rectangle(2, 2, 1, 2)); // Perimeter = 6
        rectangles.add(new Rectangle(1, 1, 3, 1)); // Perimeter = 8
        rectangles.add(new Rectangle(1, 1, 1, 5)); // Perimeter = 12
        rectangles.add(new Rectangle(1, 1, 4, 2)); // Perimeter = 12
        rectangles.add(new Rectangle(1, 1, 2, 2)); // Perimeter = 8
        rectangles.add(new Rectangle(1, 1, 5, 1)); // Perimeter = 12
        rectangles.add(new Rectangle(1, 1, 1, 6)); // Perimeter = 14
        rectangles.add(new Rectangle(1, 1, 2, 3)); // Perimeter = 10
        rectangles.add(new Rectangle(1, 1, 3, 3)); // Perimeter = 12


        BigRectangleFilter filter = new BigRectangleFilter();

        System.out.println("Rectangles with big perimeters:");
        for (Rectangle rect : rectangles) {
            if (filter.accept(rect)) {
                System.out.println(rect);
            }
        }
    }
}