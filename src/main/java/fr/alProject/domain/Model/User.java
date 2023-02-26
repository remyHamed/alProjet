package fr.alProject.domain.Model;

import fr.alProject.domain.enumerator.Status;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {
    private final String  firstName;
    private final String  lastName;
    private final int status;

    public User(String firstName, String lastName, int status) {
        this.firstName = firstName;
        this.lastName = lastName;
        int status1 = status;
        this.status = (status1);
    }
}
