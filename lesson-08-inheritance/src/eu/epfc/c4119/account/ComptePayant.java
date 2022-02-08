package eu.epfc.c4119.account;

public class ComptePayant extends Compte {
    public ComptePayant(int code) {
        super(code);
    }

    @Override
    public void verser(float montant) {
        solde += montant - 1;
    }

    @Override
    public void retirer(float montant) {
        solde += montant - 1;
    }
}
