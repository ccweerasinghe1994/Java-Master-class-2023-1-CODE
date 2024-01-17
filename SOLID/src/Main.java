import java.util.List;

public class Main {
    public static void main(String[] args) {
        AreaCalculator areaCalculator = new AreaCalculator();
        ShapesPrinter shapesPrinter = new ShapesPrinter();
        Cirlce circle = new Cirlce(5);
        Square square = new Square(5);
        Cube cube = new Cube(5);
        List<Shape> shapes = List.of(circle, square,cube);
        double sum = areaCalculator.sum(shapes);
        System.out.println(shapesPrinter.json(sum));
        System.out.println(shapesPrinter.csv(sum));
    }
}