public class Main {
    public static void main(String[] args) {
//        dependency
        CarDAO carDAO = new CarDAO();
        EmailService emailService = new EmailService();
        MOTService motService = new MOTService(emailService);
//        injection
        CarService carService = new CarService(carDAO, emailService, motService);

    }
}