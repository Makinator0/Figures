import java.util.ArrayList;
import java.util.Random;

abstract class Shape {
    protected String color;

    public Shape(String color) {
        this.color = color;
    }

    abstract double area(); // Метод для обчислення площі фігури
    abstract String getInfo(); // Метод для отримання інформації про фігуру
}