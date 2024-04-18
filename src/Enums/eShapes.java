package Enums;

import Figures.Square;

public enum eShapes
{
    Circle,
    Square,
    Trapezoid,
    Triangle;

    public static eShapes fromIndex(int index)
    {
        eShapes[] values = eShapes.values();
        if (index < 0 || index >= values.length) {
            throw new IllegalArgumentException("Index out of bound");
        }
        return values[index];
    }
}
