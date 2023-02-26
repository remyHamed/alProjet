package fr.alProject.domain.enumerator;

public enum Status {
    CLIENT(1),developer(2);
    private final int statusNumber;

    Status(int statusNumber) {
        this.statusNumber = statusNumber;
    }
}
