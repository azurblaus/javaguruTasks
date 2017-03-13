package shapes;

public class Circle extends aShape {

    private double radius;

    @Override
    public double calculateSquare() {
        double area = Math.pow(radius, radius)* Math.PI;
        return area;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
