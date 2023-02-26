package fr.alProject.domain.enumerator;


public enum StatutOffer {
    
    EN_ATTENTE(1),EN_COURS(2),TERMINEE(3);

    private final int statusNbOffre;

    StatutOffer(int statusNbOffre) {
        this.statusNbOffre = statusNbOffre;
    }
    
}
