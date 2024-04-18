package Figures;

import Enums.eColours;

public class Square extends Shape {
    private float _sideLength;

    public Square(float sideLength, eColours color) {
        super(color);
        _sideLength = sideLength;
    }

    public float GetSideLength() {
        return _sideLength;
    }

    @Override
    public float Area()
    {
        return _sideLength * _sideLength;
    }

    @Override
    public String GetInfo() {
        return String.format("Фігура: квадрат, площа: %.2f кв. од., довжина сторони: %.2f од., колір: %s",
                Area(), _sideLength, _color);
    }
}