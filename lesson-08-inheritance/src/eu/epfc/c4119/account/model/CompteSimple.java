package eu.epfc.c4119.account.model;

public class CompteSimple extends Compte {
    private final float decouvert;

    public CompteSimple(int code, float decouvert) {
        super(code);
        this.decouvert = decouvert;
    }

    @Override
    public void retirer(float montant) {
        if (solde - montant >= - decouvert) {
            solde -= montant;
        }
    }
}
