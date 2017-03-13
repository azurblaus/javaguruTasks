package shapes;

public class Triangle extends aShape {

    private double base;
    private double height;

    @Override
    public double calculateSquare() {
        double area = 0.5 * base * height;
        return area;
    }

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "base=" + base +
                ", height=" + height +
                '}';
    }
}
