public class Cube implements Shape, ThreeDimensionalShape {
    private final int length;

    public Cube(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    @Override
    public double getArea() {
        return  (getLength() * getLength() * Math.PI);
    }

    @Override
    public double volume() {
        return getLength() * getLength() * getLength();
    }
}
