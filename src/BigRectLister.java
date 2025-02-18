import java.awt.Rectangle;
import java.util.ArrayList;

public class BigRectLister {
    public static void main(String[] args) {
        ArrayList<Rectangle> rectangles = new ArrayList<>();
        BigRectangleFilter filter = new BigRectangleFilter();


        rectangles.add(new Rectangle(1, 1));
        rectangles.add(new Rectangle(2, 2));
        rectangles.add(new Rectangle(3, 2));
        rectangles.add(new Rectangle(4, 2));
        rectangles.add(new Rectangle(3, 3));
        rectangles.add(new Rectangle(5, 2));
        rectangles.add(new Rectangle(4, 4));
        rectangles.add(new Rectangle(2, 1));
        rectangles.add(new Rectangle(5, 3));
        rectangles.add(new Rectangle(1, 2));

        System.out.println("Rectangles with perimeter > 10:");
        for (Rectangle rect : rectangles) {
            if (filter.accept(rect)) {
                System.out.println("Rectangle: width = " + rect.getWidth() +
                        ", height = " + rect.getHeight() +
                        ", perimeter = " + (2 * (rect.getWidth() + rect.getHeight())));
            }
        }
    }
}