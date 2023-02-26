package fr.alProject.port.out;

import fr.alProject.adapter.Entity.SkillEntity;

import java.util.List;

public interface SkillFindAllRepository {
    List<SkillEntity> findAll();
}
