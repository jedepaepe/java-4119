package eu.epfc.c4119.account.model;

public class Compte {
    private final int code;
    protected float solde;

    public Compte(int code) {
        this.code = code;
        this.solde = 0;         // à titre de documentation
    }

    public void verser(float montant) {
        solde += montant;
    }

    public void retirer(float montant) {
        solde -= montant;
    }

    public float getSolde() {
        return solde;
    }
}
