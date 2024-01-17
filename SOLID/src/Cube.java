public class Cube implements Shape {
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

    public int getVolume() {
        return getLength() * getLength() * getLength();
    }
}
