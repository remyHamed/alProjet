package fr.alProject.port.out;

import fr.alProject.adapter.Entity.UserEntity;
import fr.alProject.domain.Model.User;

public interface UserSaveRepository {
    UserEntity save(User user);
}
