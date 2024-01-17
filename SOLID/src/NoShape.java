public class NoShape implements Shape{
    @Override
    public double getArea() {
        throw new UnsupportedOperationException("No shape");
    }
}
