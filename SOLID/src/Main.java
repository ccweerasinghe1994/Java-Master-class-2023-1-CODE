import java.util.List;

public class Main {
    public static void main(String[] args) {
        AreaCalculator areaCalculator = new AreaCalculator();
        Cirlce circle = new Cirlce(5);
        Square square = new Square(5);
        List<Object> shapes = List.of(circle, square);
        int sum = areaCalculator.sum(shapes);
        System.out.println("Sum of the areas of provided shapes is: " + sum + ".");
    }
}