package fr.alProject.adapter.persistance;

import fr.alProject.adapter.Entity.UserEntity;
import fr.alProject.port.in.UserDomainServiceFindById;
import fr.alProject.port.out.UserDomainServiceFindByidRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class UserDomainServiceFindByidRepositoryImplemented implements UserDomainServiceFindByidRepository {
    @PersistenceContext
    EntityManager entityManager;


    @Override
    public UserEntity findById(Integer userId) {
        return entityManager.find(UserEntity.class, userId);
    }
}
