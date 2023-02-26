package fr.alProject.adapter.persistance;

import fr.alProject.adapter.Entity.UserEntity;
import fr.alProject.domain.Model.User;
import fr.alProject.port.out.UserSaveRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class UserSaveRepositoryImplemented implements UserSaveRepository {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public UserEntity save(User user) {
        UserEntity ue = new UserEntity(user);
        this.entityManager.persist(ue);
        return ue;
    }
}
