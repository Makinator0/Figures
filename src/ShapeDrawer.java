import java.util.ArrayList;
import java.util.Random;
class ShapeDrawer {

    // Метод для візуалізації квадрата
    public static void drawSquare(double sideLength) {
        for (int i = 0; i < sideLength; i++) {
            for (int j = 0; j < sideLength; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Метод для візуалізації трикутника
    public static void drawTriangle(double base, double height) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Метод для візуалізації кола
    public static void drawCircle(double radius) {
        int diameter = (int) (2 * radius);
        for (int i = 0; i <= diameter; i++) {
            for (int j = 0; j <= diameter; j++) {
                double x = i - radius;
                double y = j - radius;
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
    public static void drawTrapezoid(double upperBase, double lowerBase) {
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
