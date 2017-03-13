package shapes;

public class Square extends aShape {

    private double side;

    @Override
    public double calculateSquare() {
        double area = Math.pow(side, side);
        return area;
    }

    public Square(double side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }
}
