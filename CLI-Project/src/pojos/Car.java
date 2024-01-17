package pojos;

public class Car {
    private String name;

    private String model;

    private boolean isElectric;

    private boolean isBooked;

    public Car() {
    }

    public Car(String name, String model, boolean isElectric) {
        this.name = name;
        this.model = model;
        this.isElectric = isElectric;
        this.isBooked = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public boolean isElectric() {
        return isElectric;
    }

    public void setElectric(boolean electric) {
        isElectric = electric;
    }

    public boolean isBooked() {
        return isBooked;
    }

    public void setBooked(boolean booked) {
        isBooked = booked;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", isElectric=" + isElectric +
                ", isBooked=" + isBooked +
                '}';
    }
}
