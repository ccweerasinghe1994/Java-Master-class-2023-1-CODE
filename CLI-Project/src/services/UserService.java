package services;

import doa.UserDoa;
import pojos.User;

public class UserService {
    private final UserDoa userDoa;

    public UserService() {
        this.userDoa = new UserDoa();
    }

    public boolean checkUserEligibility(String userId) {
        User user = userDoa.getUserById(userId);
        return user != null;
    }

    public void getAvailableUsers() {
        User[] users = userDoa.getUsers();

        if (users.length == 0) {
            System.out.println("No users available");
            return;
        }
        System.out.println("-------------------------     Available Users -------------------------");
        System.out.println();
        for (User user : users) {
            System.out.println(user);
        }
        System.out.println();
        System.out.println("---------------------------------------------------------------------");
    }
}
