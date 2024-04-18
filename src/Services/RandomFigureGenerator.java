package Services;
import Constants.ErrorMessages;
import Enums.eColours;
import Enums.eShapes;
import Figures.*;
import Utilities.EnumUtilities;

import java.util.ArrayList;
import java.util.Random;

public class RandomFigureGenerator
{
    private final int _maxArrayElementsCount = 10;

    private final Random random = new Random();
    public Shape generateRandomShape()
    {
        eShapes shapeType = eShapes.fromIndex(random.nextInt(eShapes.values().length));

        float param = random.nextFloat() * 10;
        //String color = ColourGenerator.GetRandomColor();
        eColours color = EnumUtilities.getRandomValue(eColours.class);
        return CreateShape(shapeType, param, color);
    }

    public void GenerateRandomShapeArrayList()
    {
        ArrayList<Shape> shapes = new ArrayList<>();
        for (int i = 0; i < random.nextInt(_maxArrayElementsCount); i++) {
            shapes.add(generateRandomShape());
        }
    }

    private Shape CreateShape(eShapes shapeType, float param, eColours color)
    {
        switch (shapeType) {
            case Square:
                var square = new Square(param, color);
                ShapeDrawer.DrawSquare(square);
                return square;
            case Triangle:
                float height = random.nextFloat() * 10;
                float hypotenuse = (float) Math.sqrt(param * param + height * height);
                Triangle triangle = new Triangle(param, height, hypotenuse, color);
                ShapeDrawer.DrawTriangle(triangle);
                return triangle;
            case Circle:
                var circle = new Circle(param, color);
                ShapeDrawer.DrawCircle(circle);
                return circle;
            case Trapezoid:
                float lowerBase = random.nextFloat() * param;
                var trapezoid = new Trapezoid(param, lowerBase, color);
                ShapeDrawer.DrawTrapezoid(trapezoid);
                return trapezoid;
            default:
                throw new IllegalArgumentException(ErrorMessages.InvalidShapeTypeMessage);
        }
    }
}
