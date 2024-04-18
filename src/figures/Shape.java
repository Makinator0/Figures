package figures;

import enums.EColours;

public abstract class Shape {
    protected EColours color;

    public Shape(EColours color) {
        this.color = color;
    }

    public abstract float Area(); // Метод для обчислення площі фігури
    public abstract String Info(); // Метод для отримання інформації про фігуру
}