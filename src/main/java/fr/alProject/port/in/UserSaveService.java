package fr.alProject.port.in;

import fr.alProject.adapter.Entity.UserEntity;
import fr.alProject.domain.Model.User;

public interface UserSaveService {
    UserEntity save(String firstName, String lastName, int status);
}
