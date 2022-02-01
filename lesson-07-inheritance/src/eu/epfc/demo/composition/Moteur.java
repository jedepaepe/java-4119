package eu.epfc.demo.composition;

public class Moteur {
    private Voiture voiture;

    public Moteur(Voiture voiture) {
        this.voiture = voiture;
    }

    public Moteur() {
    }

    public Voiture getVoiture() {
        return voiture;
    }

    public void setVoiture(Voiture voiture) {
        this.voiture = voiture;
    }
}
