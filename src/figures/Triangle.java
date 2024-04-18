package figures;

import enums.Colours;

public class Triangle extends Shape {
    private float base;
    private float height;
    private float hypotenuse;

    public Triangle(float base, float height, float hypotenuse, Colours color) {
        super(color);
        this.base = base;
        this.height = height;
        this.hypotenuse = hypotenuse;
    }

    public float height() {
        return height;
    }

    @Override
    public float area() {
        return (float) (0.5 * base * height);
    }

    @Override
    public String info() {
        return String.format("Фігура: трикутник, площа: %.2f кв. од., гіпотенуза: %.2f од., колір: %s",
                area(), hypotenuse, color);
    }
}