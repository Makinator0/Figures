package figures;

import enums.Colours;

public abstract class Shape {
    protected Colours color;

    public Shape(Colours color) {
        this.color = color;
    }

    public abstract float area(); // Метод для обчислення площі фігури
    public abstract String info(); // Метод для отримання інформації про фігуру
}