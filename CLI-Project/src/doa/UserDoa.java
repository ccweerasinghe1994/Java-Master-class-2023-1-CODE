package doa;

import pojos.User;

import java.util.UUID;

public class UserDoa {
    private static final User[] users = new User[2];

    static {
        users[0] = new User("John", UUID.fromString("8ca51d2b-aaaf-4bf2-834a-e02964e10fc3"));
        users[1] = new User("Doe", UUID.fromString("4f5dad4e-759e-4af3-a933-19f8278d3acf"));
    }

    public User[] getUsers() {
        return users;
    }

    public User getUserById(String id) {
        for (User user : users) {
            if (user.getId().toString().equals(id)) {
                return user;
            }
        }
        return null;
    }
}
