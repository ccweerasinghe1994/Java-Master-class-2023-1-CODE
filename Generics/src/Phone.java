public class Phone {
    private final String brand;

    public Phone(String brand) {
        this.brand = brand;
    }


    private String getBrand() {
        return brand;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                '}';
    }
}
