package figures;

import enums.Colours;

public class Square extends Shape {
    private final float sideLength;

    public Square(float sideLength, Colours color) {
        super(color);
        this.sideLength = sideLength;
    }

    public float sideLength() {
        return sideLength;
    }

    @Override
    public float area()
    {
        return sideLength * sideLength;
    }

    @Override
    public String info() {
        return String.format("Фігура: квадрат, площа: %.2f кв. од., довжина сторони: %.2f од., колір: %s",
                area(), sideLength, color);
    }
}