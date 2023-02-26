package fr.alProject.domain.service;

import fr.alProject.adapter.Entity.UserEntity;
import fr.alProject.domain.Model.User;
import fr.alProject.port.in.UserSaveService;
import fr.alProject.port.out.UserSaveRepository;
import org.springframework.stereotype.Service;

@Service
public class UserSaveServiceImplemented implements UserSaveService {

    UserSaveRepository userSaveRepository;

    public UserSaveServiceImplemented(UserSaveRepository userSaveRepository) {
        this.userSaveRepository = userSaveRepository;
    }

    public UserEntity save(String firstName, String lastName, int status) {
        int role;
        switch (status) {
            case 1:
            role = 1;
            break;
            case 2:
                role = 2;
                break;
            default:
                throw new IllegalArgumentException("the chosen status is unknown");
        }
        User user = new User(firstName, lastName, role);
        UserEntity usaved  = this.userSaveRepository.save(user);

        return usaved;
    }

}
