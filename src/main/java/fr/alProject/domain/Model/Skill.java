package fr.alProject.domain.Model;

import fr.alProject.adapter.Entity.UserEntity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Skill {

    private final UserEntity UserId;

    private final int price;

    private final String title;


    public Skill( UserEntity userId, int price, String title) {
        UserId = userId;
        this.price = price;
        this.title = title;
    }
}
