package utilities;

import figures.Circle;
import figures.Square;
import figures.Trapezoid;
import figures.Triangle;

public class ShapeDrawer
{
    public static void drawSquare(Square square) {
        System.out.println(square.info());
        var sideLength = square.sideLength();

        for (int i = 0; i < sideLength; i++) {
            for (int j = 0; j < sideLength; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void drawTriangle(Triangle triangle) {
        System.out.println(triangle.info());
        var height = triangle.height();

        for (int i = 0; i < height; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void drawCircle(Circle circle) {
        System.out.println(circle.info());
        float radius = circle.radius();
        int diameter = (int) (2 * radius);

        for (int i = 0; i <= diameter; i++) {
            for (int j = 0; j <= diameter; j++) {
                float x = i - radius;
                float y = j - radius;
                if (x * x + y * y <= radius * radius) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void drawTrapezoid(Trapezoid trapezoid) {
        System.out.println(trapezoid.info());
        var upperBase = trapezoid.upperBase();
        var lowerBase = trapezoid.lowerBase();
        int height = (int) Math.ceil(upperBase / 2.0);

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < lowerBase + i * 2; j++) {
                if (j < height - i || j >= lowerBase + i - (height - i)) {
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
