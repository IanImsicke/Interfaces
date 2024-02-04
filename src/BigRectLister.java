import java.awt.*;
import java.util.ArrayList;

public class BigRectLister {
    public static void main(String[] args) {
        ArrayList<Rectangle> rectangles = new ArrayList<>();
        rectangles.add(new Rectangle(3, 3));
        rectangles.add(new Rectangle(2, 5));
        rectangles.add(new Rectangle(6, 2));
        rectangles.add(new Rectangle(4, 4));
        rectangles.add(new Rectangle(1, 1));
        rectangles.add(new Rectangle(5, 7));
        rectangles.add(new Rectangle(8, 2));
        rectangles.add(new Rectangle(2, 8));
        rectangles.add(new Rectangle(1, 10));
        rectangles.add(new Rectangle(7, 7));

        BigRectangleFilter bigRectangleFilter = new BigRectangleFilter();
        ArrayList<Rectangle> bigRectangles = Main.collectAll(rectangles.toArray(new Rectangle[0]), bigRectangleFilter);

        System.out.println("Big rectangles: " + bigRectangles);
    }
}