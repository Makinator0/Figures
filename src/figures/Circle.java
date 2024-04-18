package figures;

import enums.EColours;

public class Circle extends Shape {
    private final float radius;

    public Circle(float radius, EColours color) {
        super(color);
        this.radius = radius;
    }

    public float GetRadius() {
        return radius;
    }

    @Override
    public float Area() {
        return (float) (Math.PI * radius * radius);
    }

    @Override
    public String Info() {
        return String.format("Фігура: коло, площа: %.2f кв. од., радіус: %.2f од., колір: %s",
                Area(), radius, color);
    }
}
