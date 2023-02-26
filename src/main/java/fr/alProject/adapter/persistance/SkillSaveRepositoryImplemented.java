package fr.alProject.adapter.persistance;

import fr.alProject.adapter.Entity.SkillEntity;
import fr.alProject.adapter.Entity.UserEntity;
import fr.alProject.domain.Model.Skill;
import fr.alProject.domain.Model.User;
import fr.alProject.port.out.SkillSaveRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class SkillSaveRepositoryImplemented implements SkillSaveRepository {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public SkillEntity save(Skill skilldomain) {
        SkillEntity skill = new SkillEntity(skilldomain);
        this.entityManager.persist(skill);
        return skill;
    }
}
