package fr.alProject.adapter.persistance;

import fr.alProject.adapter.Entity.SkillEntity;
import fr.alProject.port.out.SkillFindAllRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Transactional
public class SkillFindAllRepositoryImplemented implements SkillFindAllRepository {
    @PersistenceContext
    EntityManager entityManager;

    @Override
    public List<SkillEntity> findAll() {
        return this.entityManager.createQuery("SELECT s FROM SkillEntity s", SkillEntity.class).getResultList();
    }
}
