package figures;

import enums.Colours;

public class Trapezoid extends Shape {
    private final float upperBase;
    private final float lowerBase;

    public Trapezoid(float upperBase, float lowerBase, Colours color) {
        super(color);
        this.upperBase = upperBase;
        this.lowerBase = lowerBase;
    }

    public float upperBase() {
        return upperBase;
    }

    public float lowerBase() {
        return lowerBase;
    }

    @Override
    public float area() {
        return (float) (0.5 * (upperBase + lowerBase)); // Площа трапеції обчислюється за формулою: (a + b) / 2 * h
    }

    @Override
    public String info() {
        return String.format("Фігура: трапеція, площа: %.2f кв. од., верхня основа: %.2f од., колір: %s",
                area(), upperBase, color);
    }
}

