package eu.epfc.demo.composition;

public class Roue {
    private Voiture voiture;

    public Roue(Voiture voiture) {
        this.voiture = voiture;
    }

    public Roue() {
    }

    public Voiture getVoiture() {
        return voiture;
    }

    public void setVoiture(Voiture voiture) {
        this.voiture = voiture;
    }
}
