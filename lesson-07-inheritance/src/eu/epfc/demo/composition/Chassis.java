package eu.epfc.demo.composition;

public class Chassis {
    private Voiture voiture;

    public Chassis(Voiture voiture) {
        this.voiture = voiture;
    }

    public Chassis() {
    }

    public Voiture getVoiture() {
        return voiture;
    }

    public void setVoiture(Voiture voiture) {
        this.voiture = voiture;
    }
}
