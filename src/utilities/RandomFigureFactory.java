package utilities;
import enums.Colours;
import enums.Shapes;
import figures.*;

import java.util.ArrayList;

public class RandomFigureFactory
{
    public ArrayList<Shape> generateRandomShapes(int count) {
        ArrayList<Shape> shapes = new ArrayList<>();
        for (int i = 0; i < RandomUtil.random.nextInt(count); i++) {
            shapes.add(generateRandomShape());
        }
        return shapes;
    }

    private Shape generateRandomShape() {
        Shapes shapeType = Shapes.values()[RandomUtil.random.nextInt(Shapes.values().length)];
        float param = RandomUtil.random.nextFloat() * 10;
        Colours color = EnumUtil.getRandomValue(Colours.class);

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

    private Square createSquare(float sideLength, Colours color) {
        Square square = new Square(sideLength, color);
        ShapeDrawer.drawSquare(square);
        return square;
    }

    private Triangle createTriangle(float base, Colours color) {
        float height = RandomUtil.random.nextFloat() * 10;
        float hypotenuse = (float) Math.sqrt(base * base + height * height);
        Triangle triangle = new Triangle(base, height, hypotenuse, color);
        ShapeDrawer.drawTriangle(triangle);
        return triangle;
    }

    private Circle createCircle(float radius, Colours color) {
        Circle circle = new Circle(radius, color);
        ShapeDrawer.drawCircle(circle);
        return circle;
    }

    private Trapezoid createTrapezoid(float upperBase, Colours color) {
        float lowerBase = RandomUtil.random.nextFloat() * upperBase;
        Trapezoid trapezoid = new Trapezoid(upperBase, lowerBase, color);
        ShapeDrawer.drawTrapezoid(trapezoid);
        return trapezoid;
    }
}
