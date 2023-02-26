package fr.alProject.port.out;

import fr.alProject.adapter.Entity.SkillEntity;
import fr.alProject.domain.Model.Skill;

public interface SkillSaveRepository {
    SkillEntity save(Skill skill);
}
