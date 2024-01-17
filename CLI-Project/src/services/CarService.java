package services;

import doa.CarDoa;

public class CarService {
    private final CarDoa carDoa;

    public CarService() {
        this.carDoa = new CarDoa();
    }

    public boolean checkCarAvailability(String model) {
        boolean isAvailable = carDoa.checkAvailability(model);
        if (isAvailable) {
            System.out.println("Car is available");
        } else {
            System.out.println("Car is not available");
        }
        return isAvailable;
    }

    public void printElectricCars() {
        carDoa.getElectricCars();
    }

    public void printAllAvailableCars() {
        carDoa.printAllAvailableCars();
    }

    public void printBookedCars() {
        carDoa.printBookedCars();
    }
}
