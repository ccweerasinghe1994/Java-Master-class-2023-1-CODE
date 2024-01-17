
public class ShapesPrinter {
    public String json(double sum){
        return "{sum: %s}".formatted(sum);
    }
    public String csv(double sum){
        return "sum,%s".formatted(sum);
    }
}
