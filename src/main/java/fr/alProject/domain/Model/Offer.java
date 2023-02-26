package Domaine;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Offer {

  private Long id;
  private String titre;
  private String description;
  private BigDecimal prix;
  private LocalDate dateLimite;

  public Offer(String name, String description, BigDecimal price) {
    this.titre = titre;
    this.description = description;
    this.prix = prix;
    this.dateLimite = dateLimite;

  }

  public String getTitle() {
    return titre;
  }

  public String getDescription() {
    return description;
  }

  public BigDecimal getPrice() {
    return prix;
  }

  public LocalDate getDateLimite() {
    return dateLimite;
  }

}

