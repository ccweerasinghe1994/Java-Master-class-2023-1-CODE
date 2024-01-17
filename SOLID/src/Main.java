import java.util.List;

public class Main {
    public static void main(String[] args) {
        IAreaCalculator areaCalculator = new AreaCalculatorV2();
        ShapesPrinter shapesPrinter = new ShapesPrinter(areaCalculator);
        Cirlce circle = new Cirlce(5);
        Square square = new Square(5);
//        Shape noShape = new NoShape();
        Cube cube = new Cube(5);
        List<Shape> shapes = List.of(circle, square,cube);
        double sum = areaCalculator.sum(shapes);
        System.out.println(shapesPrinter.json(shapes));
        System.out.println(shapesPrinter.csv(shapes));
    }
}