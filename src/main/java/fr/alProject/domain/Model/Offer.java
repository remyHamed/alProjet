package fr.alProject.domain.Model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Offer {

  private Long id;
  private String titre;
  private String description;
  private BigDecimal prix;
  private LocalDate dateLimite;

  public Offer(String name, String description, BigDecimal prix) {
    this.titre = titre;
    this.description = description;
    this.prix = prix;
    this.dateLimite = dateLimite;

  }

}

