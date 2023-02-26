package fr.alProject.adapter.persistance;

import fr.alProject.domain.Model.Offer;
import fr.alProject.adapter.persistance.OfferRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class OfferRepositoryImpl implements OfferRepository {

    private final List<Offer> offers = new ArrayList<>();
    private Long idCounter = 0L;

    @Override
    public Offer save(Offer offer) {
        if (offer.getId() == null) {
            offer.setId(++idCounter);
        }
        offers.add(offer);
        return offer;
    }

    @Override
    public Optional<Offer> findById(Long id) {
        return offers.stream()
                .filter(offer -> offer.getId().equals(id))
                .findFirst();
    }

    @Override
    public List<Offer> findAll() {
        return offers;
    }
}
