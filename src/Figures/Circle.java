package Figures;

import Enums.eColours;

public class Circle extends Shape {
    private float _radius;

    public Circle(float radius, eColours color) {
        super(color);
        _radius = radius;
    }

    public float GetRadius() {
        return _radius;
    }

    @Override
    public float Area() {
        return (float) (Math.PI * _radius * _radius);
    }

    @Override
    public String GetInfo() {
        return String.format("Фігура: коло, площа: %.2f кв. од., радіус: %.2f од., колір: %s",
                Area(), _radius, _color);
    }
}
