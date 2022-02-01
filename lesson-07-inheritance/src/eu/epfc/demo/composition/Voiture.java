package eu.epfc.demo.composition;

import java.util.ArrayList;

public class Voiture {
    private Moteur moteur;
    private Chassis chassis;
    private ArrayList<Roue> roues;

    public Voiture(Moteur moteur, Chassis chassis, ArrayList<Roue> roues) {
        this.moteur = moteur;
        this.chassis = chassis;
        this.roues = roues;
    }

    public Voiture() {
    }

    public Moteur getMoteur() {
        return moteur;
    }

    public void setMoteur(Moteur moteur) {
        this.moteur = moteur;
    }

    public Chassis getChassis() {
        return chassis;
    }

    public void setChassis(Chassis chassis) {
        this.chassis = chassis;
    }

    public ArrayList<Roue> getRoues() {
        return roues;
    }

    public void setRoues(ArrayList<Roue> roues) {
        this.roues = roues;
    }
}
