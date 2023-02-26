package fr.alProject.domain.domainService;

import fr.alProject.adapter.Entity.UserEntity;
import fr.alProject.domain.Model.User;
import fr.alProject.port.in.UserDomainServiceFindById;
import fr.alProject.port.out.UserDomainServiceFindByidRepository;
import org.springframework.stereotype.Service;

@Service
public class UserDomainServiceFindByIdImplemented implements UserDomainServiceFindById {

    UserDomainServiceFindByidRepository userDomainServiceFindByidRepository;

    UserDomainServiceFindByIdImplemented(UserDomainServiceFindByidRepository userDomainServiceFindByidRepository) {
        this.userDomainServiceFindByidRepository = userDomainServiceFindByidRepository;
    }
    @Override
    public UserEntity findById(Integer userId) {
        UserEntity user = this.userDomainServiceFindByidRepository.findById(userId);
        return user;
    }
}
