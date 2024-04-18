package utilities;
import enums.EColours;
import enums.EShapes;
import figures.*;

import java.util.ArrayList;

public class RandomFigureFactory
{
    private final int maxArrayElementsCount = 10;

    public ArrayList<Shape> generateRandomShapes() {
        ArrayList<Shape> shapes = new ArrayList<>();
        for (int i = 0; i < RandomUtil.random.nextInt(maxArrayElementsCount); i++) {
            shapes.add(generateRandomShape());
        }
        return shapes;
    }

    private Shape generateRandomShape() {
        EShapes shapeType = EShapes.values()[RandomUtil.random.nextInt(EShapes.values().length)];
        float param = RandomUtil.random.nextFloat() * 10;
        EColours color = EnumUtilities.getRandomValue(EColours.class);

        switch (shapeType) {
            case Square:
                return createSquare(param, color);
            case Triangle:
                return createTriangle(param, color);
            case Circle:
                return createCircle(param, color);
            case Trapezoid:
                return createTrapezoid(param, color);
            default:
                throw new IllegalArgumentException("Invalid shape type");
        }
    }

    private Square createSquare(float sideLength, EColours color) {
        Square square = new Square(sideLength, color);
        ShapeDrawer.DrawSquare(square);
        return square;
    }

    private Triangle createTriangle(float base, EColours color) {
        float height = RandomUtil.random.nextFloat() * 10;
        float hypotenuse = (float) Math.sqrt(base * base + height * height);
        Triangle triangle = new Triangle(base, height, hypotenuse, color);
        ShapeDrawer.DrawTriangle(triangle);
        return triangle;
    }

    private Circle createCircle(float radius, EColours color) {
        Circle circle = new Circle(radius, color);
        ShapeDrawer.DrawCircle(circle);
        return circle;
    }

    private Trapezoid createTrapezoid(float upperBase, EColours color) {
        float lowerBase = RandomUtil.random.nextFloat() * upperBase;
        Trapezoid trapezoid = new Trapezoid(upperBase, lowerBase, color);
        ShapeDrawer.DrawTrapezoid(trapezoid);
        return trapezoid;
    }
}
