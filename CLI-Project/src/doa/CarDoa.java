package doa;

import pojos.Car;

public class CarDoa {
    private static final Car[] cars;
    private static final int MAX_CARS = 10;

    static {
        cars = new Car[MAX_CARS];
        cars[0] = new Car("Tesla", "Model S", true);
        cars[1] = new Car("Tesla", "Model 3", true);
        cars[2] = new Car("Tesla", "Model X", true);
        cars[3] = new Car("Tesla", "Model Y", true);
        cars[4] = new Car("Tesla", "Cybertruck", true);
        cars[5] = new Car("Tesla", "Roadster", true);
        cars[6] = new Car("Tesla", "Semi", true);
        cars[7] = new Car("Tesla", "Model 3", true);
        cars[8] = new Car("Hona", "Civic", false);
        cars[9] = new Car("Hona", "Accord", false);
    }

    public static Car[] getCars() {
        return cars;
    }

    private Car getCarByModel(String model) {
        for (Car car : cars) {
            if (car.getModel().equals(model)) {
                return car;
            }
        }
        return null;
    }

    public boolean checkAvailability(String model) {
        Car car = getCarByModel(model);
        return car != null && !car.isBooked();
    }

    public void getElectricCars() {
        for (Car car : cars) {
            if (car.isElectric() && !car.isBooked()) {
                System.out.println(car);
            }
        }
    }

    public void printAllAvailableCars() {
        for (Car car : cars) {
            if (!car.isBooked()) {
                System.out.println(car);
            }
        }
    }

    public void printBookedCars() {

        for (Car car : cars) {
            if (car.isBooked()) {
                System.out.println(car);
            }
        }
    }

    public void setCarBooked(String model) {
        Car car = getCarByModel(model);
        if (car != null) {
            car.setBooked(true);
        }
    }
}
