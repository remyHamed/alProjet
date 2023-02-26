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
  private final int status;

  public Offer(String name, String description, BigDecimal price, int status) {
    this.titre = titre;
    this.description = description;
    this.prix = prix;
    this.dateLimite = dateLimite;

  }
}

