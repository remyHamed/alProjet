package fr.alProject.adapter.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import fr.alProject.domain.Model.Skill;
import fr.alProject.domain.Model.User;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class SkillEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @JsonBackReference
    @OneToOne
    @JoinColumn(name = "user_id")
    private UserEntity user;

    private int price;

    private String title;

    public SkillEntity(Skill skill) {
        this.price = skill.getPrice();
        this.title = skill.getTitle();
    }
    public SkillEntity() {

    }

}
