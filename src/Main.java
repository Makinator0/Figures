import utilities.RandomFigureFactory;

public class Main {
    public static void main(String[] args) {
        RandomFigureFactory randomFigureGenerator = new RandomFigureFactory();

        int maxArrayElementsCount = 10;
        randomFigureGenerator.generateRandomShapes(maxArrayElementsCount);
    }
}