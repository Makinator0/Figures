package Services;

import Figures.Circle;
import Figures.Square;
import Figures.Trapezoid;
import Figures.Triangle;

public class ShapeDrawer
{
    // Метод для візуалізації квадрата
    public static void DrawSquare(Square square)
    {
        System.out.println(square.GetInfo());
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
        System.out.println(triangle.GetInfo());
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
        System.out.println(circle.GetInfo());
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
        System.out.println(trapezoid.GetInfo());
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
