package eu.epfc.c4119.account.model;

public class CompteEpargne extends Compte {
    private final float taux;

    public CompteEpargne(int code, float taux) {
        super(code);
        this.taux = taux;
    }

    public void calculInteret() {
        solde += solde * taux / 100;
    }
}
