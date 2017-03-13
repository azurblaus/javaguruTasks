import shapes.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SquareCalculator {

    public static void main(String[] args) {

        Random randomGenerator = new Random();
        List<aShape> theList = new ArrayList<>();
        theList.add(new Circle(randomGenerator.nextDouble()));
        theList.add(new Square(randomGenerator.nextDouble()));
        theList.add(new Triangle(randomGenerator.nextDouble(), randomGenerator.nextDouble()));
        theList.add(new Rectangle(randomGenerator.nextDouble(), randomGenerator.nextDouble()));

        System.out.println(theList);
    }

}
