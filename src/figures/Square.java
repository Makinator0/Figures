package figures;

import enums.EColours;

public class Square extends Shape {
    private final float sideLength;

    public Square(float sideLength, EColours color) {
        super(color);
        this.sideLength = sideLength;
    }

    public float SideLength() {
        return sideLength;
    }

    @Override
    public float Area()
    {
        return sideLength * sideLength;
    }

    @Override
    public String Info() {
        return String.format("Фігура: квадрат, площа: %.2f кв. од., довжина сторони: %.2f од., колір: %s",
                Area(), sideLength, color);
    }
}