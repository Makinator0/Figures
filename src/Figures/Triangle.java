package Figures;

import Enums.eColours;

public class Triangle extends Shape {
    private float _base;
    private float _height;
    private float _hypotenuse;

    public Triangle(float base, float height, float hypotenuse, eColours color) {
        super(color);
        _base = base;
        _height = height;
        _hypotenuse = hypotenuse;
    }

    public float GetBase() {
        return _base;
    }

    public float GetHeight() {
        return _height;
    }

    @Override
    public float Area() {
        return (float) (0.5 * _base * _height);
    }

    @Override
    public String GetInfo() {
        return String.format("Фігура: трикутник, площа: %.2f кв. од., гіпотенуза: %.2f од., колір: %s",
                Area(), _hypotenuse, _color);
    }
}