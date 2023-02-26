package fr.alProject.domain.Model;

import fr.alProject.domain.enumerator.Status;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {
    private final String  firstName;
    private final String  lastName;
    private final Status  status;

    public User(String firstName, String lastName, Status status) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.status = status;
    }
}
