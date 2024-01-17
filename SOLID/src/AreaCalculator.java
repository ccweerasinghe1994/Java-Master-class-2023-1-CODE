import java.util.List;

public class AreaCalculator {
    public int sum(List<Object> shapes){
        int sum = 0;
        for (Object shape : shapes) {
            if (shape instanceof Cirlce circle) {
                sum += (int) (circle.getRadius() * circle.getRadius() * Math.PI);
            } else if (shape instanceof Square square) {
                sum += square.getLength() * square.getLength();
            }
        }
        return sum;
    }
}
