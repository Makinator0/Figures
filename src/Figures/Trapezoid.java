package Figures;

import Enums.eColours;

public class Trapezoid extends Shape {
    private final float _upperBase;
    private final float _lowerBase;

    public Trapezoid(float upperBase, float lowerBase, eColours color) {
        super(color);
        _upperBase = upperBase;
        _lowerBase = lowerBase;
    }

    public float GetUpperBase() {
        return _upperBase;
    }

    public float GetLowerBase() {
        return _lowerBase;
    }

    @Override
    public float Area() {
        return (float) (0.5 * (_upperBase + _lowerBase)); // Площа трапеції обчислюється за формулою: (a + b) / 2 * h
    }

    @Override
    public String GetInfo() {
        return String.format("Фігура: трапеція, площа: %.2f кв. од., верхня основа: %.2f од., колір: %s",
                Area(), _upperBase, _color);
    }
}

