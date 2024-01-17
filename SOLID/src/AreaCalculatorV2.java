import java.util.List;

public class AreaCalculatorV2 implements IAreaCalculator {
    @Override
    public double sum(List<Shape> shapes){
        double sum = 0;
        for (Shape shape : shapes) {
            sum+= shape.getArea();
        }
        return sum;
    }
}
