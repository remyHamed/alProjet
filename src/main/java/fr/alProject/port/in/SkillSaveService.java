package fr.alProject.port.in;

import fr.alProject.adapter.Entity.SkillEntity;

public interface SkillSaveService {
    SkillEntity save(int UserId, String Title, int price);
}
