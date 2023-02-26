package fr.alProject.adapter.persistance;

import fr.alProject.domain.Model.Offer;
import java.util.List;
import java.util.Optional;

public interface OfferRepository {
    Offer save(Offer offer);
    Optional<Offer> findById(Long id);
    List<Offer> findAll();
}
