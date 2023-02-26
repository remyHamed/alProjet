package fr.alProject.domain.service;

import fr.alProject.adapter.Entity.SkillEntity;
import fr.alProject.adapter.Entity.UserEntity;
import fr.alProject.domain.Model.Skill;
import fr.alProject.domain.domainService.UserDomainServiceFindByIdImplemented;
import fr.alProject.port.in.SkillSaveService;
import org.springframework.stereotype.Service;

@Service
public class SkillSaveSaveServiceImplemented implements SkillSaveService {

    UserDomainServiceFindByIdImplemented userDomainServiceFindByIdImplemented;

    public SkillSaveSaveServiceImplemented(
            UserDomainServiceFindByIdImplemented userDomainServiceFindByIdImplemented) {
        this.userDomainServiceFindByIdImplemented = userDomainServiceFindByIdImplemented;
    }

    @Override
    public SkillEntity save(int UserId, String title, int price) {
        UserEntity user = this.userDomainServiceFindByIdImplemented.findById(UserId);
        Skill nwSkill = new Skill(user,price,title);
    }
}
