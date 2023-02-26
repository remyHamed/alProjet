package fr.alProject.port.out;

import fr.alProject.adapter.Entity.UserEntity;
import fr.alProject.domain.Model.User;

public interface UserDomainServiceFindByidRepository {
    UserEntity findById(Integer userId);
}
