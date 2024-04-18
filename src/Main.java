import java.util.ArrayList;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Shape> shapes = new ArrayList<>(); // Динамічний масив фігур

        // Випадкове визначення кількості фігур (від 1 до 10)
        int numberOfShapes = random.nextInt(10) + 1;

        // Генерація фігур
        for (int i = 0; i < numberOfShapes; i++) { // Генеруємо випадкову кількість фігур
            // Випадковий вибір типу фігури
            int choice = random.nextInt(4); // Випадковий вибір із 4 можливих типів

            // Генерація випадкових параметрів
            double param = random.nextDouble() * 10; // Випадковий параметр

            // Генерація випадкового кольору
            String color = getRandomColor();

            // Створення фігури відповідно до вибору
            switch (choice) {
                case 0:
                    shapes.add(new Square(param, color));
                    break;
                case 1:
                    // Випадкові параметри для трикутника
                    double base = random.nextDouble() * 10; // Випадкова база
                    double height = random.nextDouble() * 10; // Випадкова висота
                    double hypotenuse = Math.sqrt(Math.pow(base, 2) + Math.pow(height, 2)); // Обчислення гіпотенузи
                    shapes.add(new Triangle(base, height, hypotenuse, color));
                    break;
                case 2:
                    shapes.add(new Circle(param, color));
                    break;
                case 3:
                    // Випадкові параметри для трапеції
                    double upperBase = random.nextDouble() * 10; // Випадкова верхня база
                    double lowerBase = random.nextDouble() * upperBase; // Випадкова нижня база
                    shapes.add(new Trapezoid(upperBase, lowerBase, color));
                    break;
                default:
                    break;
            }
        }

        // Виведення інформації про кожну фігуру та візуалізація їх у консолі
        for (Shape shape : shapes) {
            System.out.println(shape.getInfo());
            if (shape instanceof Square) {
                ShapeDrawer.drawSquare(((Square) shape).getSideLength());
            } else if (shape instanceof Triangle) {
                ShapeDrawer.drawTriangle(((Triangle) shape).getBase(), ((Triangle) shape).getHeight());
            } else if (shape instanceof Circle) {
                ShapeDrawer.drawCircle(((Circle) shape).getRadius());
            } else if (shape instanceof Trapezoid) {
                ShapeDrawer.drawTrapezoid(((Trapezoid) shape).getUpperBase(), ((Trapezoid) shape).getLowerBase());
            }
            System.out.println();
        }
    }

    // Метод для генерації випадкового кольору
    private static String getRandomColor() {
        String[] colors = {"червоний", "синій", "жовтий", "зелений", "оранжевий"}; // Масив доступних кольорів
        Random random = new Random();
        return colors[random.nextInt(colors.length)]; // Повертає випадковий колір
    }
}