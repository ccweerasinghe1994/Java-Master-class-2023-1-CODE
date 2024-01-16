package util;

import doa.UserDoa;
import pojos.User;
public class CommonUtils {
    private final static UserDoa userDoa = new UserDoa();
    public static boolean checkCustomerEligibility(String userId) {
        User user = userDoa.getUserById(userId);
        return user != null;
    }

    public static void printOptions(){
        System.out.println("1️⃣ - Book a car");
        System.out.println("2️⃣ - View All User Booked Cars");
        System.out.println("3️⃣ - View All Bookings");
        System.out.println("4️⃣ - View Available Cars");
        System.out.println("5️⃣ - View Available Electric Cars");
        System.out.println("6️⃣ - View All Users");
        System.out.println("7️⃣ - Exit");
    }
}
