class Circle extends Shape {
    private double radius;

    public Circle(double radius, String color) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }

    @Override
    String getInfo() {
        return String.format("Фігура: коло, площа: %.2f кв. од., радіус: %.2f од., колір: %s",
                area(), radius, color);
    }
}
