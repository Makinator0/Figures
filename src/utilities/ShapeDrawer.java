package utilities;

import figures.Circle;
import figures.Square;
import figures.Trapezoid;
import figures.Triangle;

public class ShapeDrawer
{
    // Метод для візуалізації квадрата
    public static void DrawSquare(Square square)
    {
        System.out.println(square.Info());
        var sideLength = square.GetSideLength();

        for (int i = 0; i < sideLength; i++) {
            for (int j = 0; j < sideLength; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Метод для візуалізації трикутника
    public static void DrawTriangle(Triangle triangle)
    {
        System.out.println(triangle.Info());
        var height = triangle.GetHeight();

        for (int i = 0; i < height; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Метод для візуалізації кола
    public static void DrawCircle(Circle circle)
    {
        System.out.println(circle.Info());
        float radius = circle.GetRadius();
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

    // Метод для візуалізації трапеції
    public static void DrawTrapezoid(Trapezoid trapezoid)
    {
        System.out.println(trapezoid.Info());
        var upperBase = trapezoid.GetUpperBase();
        var lowerBase = trapezoid.GetLowerBase();
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
