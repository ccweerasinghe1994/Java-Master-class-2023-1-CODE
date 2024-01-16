public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Bicycle bicycle = new Bicycle();
        ElectricScooter electricScooter = new ElectricScooter();

        Vehicle[] vehicles = {car, bicycle, electricScooter};

        Person person = new Person("John", vehicles);

        for (Vehicle vehicle : person.getVehicles()) {
            vehicle.move(10);
        }
    }
}