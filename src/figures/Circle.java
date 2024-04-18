package figures;

import enums.Colours;

public class Circle extends Shape {
    private final float radius;

    public Circle(float radius, Colours color) {
        super(color);
        this.radius = radius;
    }

    public float radius() {
        return radius;
    }

    @Override
    public float area() {
        return (float) (Math.PI * radius * radius);
    }

    @Override
    public String info() {
        return String.format("Фігура: коло, площа: %.2f кв. од., радіус: %.2f од., колір: %s",
                area(), radius, color);
    }
}
