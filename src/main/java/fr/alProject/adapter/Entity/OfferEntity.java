package fr.alProject.adapter.Entity;

import fr.alProject.domain.Model.Offer;
import lombok.Getter;
import lombok.Setter;import fr.alProject.domain.enumerator.StatutOffer;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
public class OfferEntity {

    private Long id;
    private String title;
    private String description;
    private BigDecimal price;
    private LocalDate deadline;
    private StatutOffer statutOffer;

    public OfferEntity(String title, String description, BigDecimal price, LocalDate deadline, StatutOffer statutOffer) {
        this.title = title;
        this.description = description;
        this.price = price;
        this.deadline = deadline;
        this.statutOffer = statutOffer;
    }

    public OfferEntity() {

    }

}

