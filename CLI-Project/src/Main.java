import services.BookingService;
import services.CarService;
import services.UserService;
import util.CommonUtils;

import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final UserService userService = new UserService();
    private static final CarService carService = new CarService();

    private static final BookingService bookingService = new BookingService();

    // 8ca51d2b-aaaf-4bf2-834a-e02964e10fc3
    public static void main(String[] args) {
        int choice = 0;
        while (choice >= 0) {

            switch (choice) {
                case 0 -> {
                    CommonUtils.printOptions();
                    System.out.print("Enter your choice ? ");
                    choice = scanner.nextInt();
                    scanner.nextLine();
                }
                case 1 -> {
                    System.out.print("Enter your id ? ");
                    String id = scanner.nextLine();
                    boolean isValidUser = userService.checkUserEligibility(id);
                    if (!isValidUser) {
                        System.out.println("You are not eligible to rent a car");
                        return;
                    }
                    System.out.print("Enter car model ? ");
                    String model = scanner.nextLine();
                    boolean isAvailable = carService.checkCarAvailability(model);
                    if (isAvailable) {
                        bookingService.bookCar(id, model);
                    }
                    choice = 0;
                }
                case 2 -> {
                    carService.printBookedCars();
                    choice = 0;
                }
                case 3 -> {
                    bookingService.printBookingsByUser();
                    choice = 0;
                }
                case 4 -> {
                    carService.printAllAvailableCars();
                    choice = 0;
                }
                case 5 -> {
                    carService.printElectricCars();
                    choice = 0;
                }
                case 6 -> {
                    userService.getAvailableUsers();
                    choice = 0;
                }
                case 7 -> {
                    System.out.println("Exiting...");
                    choice = -1;
                }
                default -> {
                    System.out.println("Invalid choice");
                    choice = 0;
                }
            }

        }

    }


}