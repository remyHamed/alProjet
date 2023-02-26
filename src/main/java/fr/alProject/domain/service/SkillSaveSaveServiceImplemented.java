package fr.alProject.domain.service;

import fr.alProject.adapter.Entity.SkillEntity;
import fr.alProject.adapter.Entity.UserEntity;
import fr.alProject.domain.Model.Skill;
import fr.alProject.domain.domainService.UserDomainServiceFindByIdImplemented;
import fr.alProject.domain.exeption.UserNotFoundException;
import fr.alProject.port.in.SkillSaveService;
import fr.alProject.port.out.SkillSaveRepository;
import org.springframework.stereotype.Service;

@Service
public class SkillSaveSaveServiceImplemented implements SkillSaveService {

    UserDomainServiceFindByIdImplemented userDomainServiceFindByIdImplemented;
    SkillSaveRepository skillSaveRepository;

    public SkillSaveSaveServiceImplemented(
            UserDomainServiceFindByIdImplemented userDomainServiceFindByIdImplemented,
            SkillSaveRepository skillSaveRepository
    ) {
        this.userDomainServiceFindByIdImplemented = userDomainServiceFindByIdImplemented;
        this.skillSaveRepository = skillSaveRepository;
    }

    @Override
    public SkillEntity save(int UserId, String title, int price) {
        UserEntity user = this.userDomainServiceFindByIdImplemented.findById(UserId);
        if (user == null) {
            throw new UserNotFoundException("User with id " + UserId + " not found");
        }
        Skill nwSkill = new Skill(user,price,title);
        return  this.skillSaveRepository.save(nwSkill);
    }
}
