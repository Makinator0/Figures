class Triangle extends Shape {
    private double base;
    private double height;
    private double hypotenuse;

    public Triangle(double base, double height, double hypotenuse, String color) {
        super(color);
        this.base = base;
        this.height = height;
        this.hypotenuse = hypotenuse;
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    @Override
    double area() {
        return 0.5 * base * height;
    }

    @Override
    String getInfo() {
        return String.format("Фігура: трикутник, площа: %.2f кв. од., гіпотенуза: %.2f од., колір: %s",
                area(), hypotenuse, color);
    }
}