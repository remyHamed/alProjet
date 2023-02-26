package fr.alProject.domain.service;

import fr.alProject.adapter.Entity.SkillEntity;
import fr.alProject.port.in.SkillserviceFindAll;
import fr.alProject.port.out.SkillFindAllRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SkillServiceFindAllImplemented implements SkillserviceFindAll {

    SkillFindAllRepository skillFindAllRepository;

    SkillServiceFindAllImplemented(SkillFindAllRepository skillFindAllRepository) {
        this.skillFindAllRepository = skillFindAllRepository;
    }


    @Override
    public List<SkillEntity> findAll() {
        return this.skillFindAllRepository.findAll();
    }
}
