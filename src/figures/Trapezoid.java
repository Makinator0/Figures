package figures;

import enums.EColours;

public class Trapezoid extends Shape {
    private final float upperBase;
    private final float lowerBase;

    public Trapezoid(float upperBase, float lowerBase, EColours color) {
        super(color);
        this.upperBase = upperBase;
        this.lowerBase = lowerBase;
    }

    public float GetUpperBase() {
        return upperBase;
    }

    public float GetLowerBase() {
        return lowerBase;
    }

    @Override
    public float Area() {
        return (float) (0.5 * (upperBase + lowerBase)); // Площа трапеції обчислюється за формулою: (a + b) / 2 * h
    }

    @Override
    public String Info() {
        return String.format("Фігура: трапеція, площа: %.2f кв. од., верхня основа: %.2f од., колір: %s",
                Area(), upperBase, color);
    }
}

