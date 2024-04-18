class Trapezoid extends Shape {
    private double upperBase;
    private double lowerBase;

    public Trapezoid(double upperBase, double lowerBase, String color) {
        super(color);
        this.upperBase = upperBase;
        this.lowerBase = lowerBase;
    }

    public double getUpperBase() {
        return upperBase;
    }

    public double getLowerBase() {
        return lowerBase;
    }

    @Override
    double area() {
        return 0.5 * (upperBase + lowerBase); // Площа трапеції обчислюється за формулою: (a + b) / 2 * h
    }

    @Override
    String getInfo() {
        return String.format("Фігура: трапеція, площа: %.2f кв. од., верхня основа: %.2f од., колір: %s",
                area(), upperBase, color);
    }
}

