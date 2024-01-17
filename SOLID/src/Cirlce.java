public class Cirlce implements Shape{
    @Override
    public double getArea() {
        return  (getRadius() * getRadius() * Math.PI);
    }

    private final int radius;

    public Cirlce(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }
}
