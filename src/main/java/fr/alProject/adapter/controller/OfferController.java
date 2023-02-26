package fr.alProject.adapter.controller;

import fr.alProject.adapter.Entity.OfferEntity;
import fr.alProject.domain.domainService.OfferService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/offers")
@RequiredArgsConstructor
public class OfferController {

    private final OfferService offerService;

    @PostMapping
    public OfferEntity createOffer(@RequestBody OfferEntity offer) {
        return offerService.createOffer(offer);
    }

    @GetMapping("/{id}")
    public OfferEntity getOffer(@PathVariable Long id) {
        return offerService.getOffer(id);
    }

    @PutMapping("/{id}")
    public OfferEntity updateOffer(@PathVariable Long id, @RequestBody OfferEntity offer) {
        offer.setId(id);
        return offerService.updateOffer(offer);
    }

    @DeleteMapping("/{id}")
    public void deleteOffer(@PathVariable Long id) {
        offerService.deleteOffer(id);
    }
}
