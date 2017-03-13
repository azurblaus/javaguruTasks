package shapes;

public class Rectangle extends aShape {

    private double height;
    private double width;

    @Override
    public double calculateSquare() {
        double area = height * width;
        return area;
    }

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "height=" + height +
                ", width=" + width +
                '}';
    }
}
