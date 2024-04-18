package Figures;

import Enums.eColours;

public abstract class Shape {
    protected eColours _color;

    public Shape(eColours color) {
        _color = color;
    }

    public abstract float Area(); // Метод для обчислення площі фігури
    public abstract String GetInfo(); // Метод для отримання інформації про фігуру
}