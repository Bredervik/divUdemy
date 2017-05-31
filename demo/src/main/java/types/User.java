package types;

import lombok.Data;

@Data
public class User {

    private String firstName;
    private String lastName;
    private String email;

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
