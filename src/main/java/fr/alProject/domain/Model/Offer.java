package fr.alProject.domain.Model;

import fr.alProject.domain.enumerator.StatutOffer;
import lombok.Getter;
import lombok.Setter;
import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
public class Offer {

  private Long id;
  private String titre;
  private String description;
  private BigDecimal prix;
  private LocalDate dateLimite;
  private StatutOffer statutOffer;

  public Offer(String name, String description, BigDecimal price, StatutOffer statutOffer) {
    this.titre = titre;
    this.description = description;
    this.prix = prix;
    this.dateLimite = dateLimite;
    this.statutOffer = statutOffer;
  }
}

