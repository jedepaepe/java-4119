package eu.epfc.c4119.account;

public class CompteSimple extends Compte {
    float decouvert;

    CompteSimple(int code, float decouvert) {
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
