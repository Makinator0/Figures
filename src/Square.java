class Square extends Shape {
    private double sideLength;

    public Square(double sideLength, String color) {
        super(color);
        this.sideLength = sideLength;
    }

    public double getSideLength() {
        return sideLength;
    }

    @Override
    double area() {
        return sideLength * sideLength;
    }

    @Override
    String getInfo() {
        return String.format("Фігура: квадрат, площа: %.2f кв. од., довжина сторони: %.2f од., колір: %s",
                area(), sideLength, color);
    }
}