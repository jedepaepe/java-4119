package eu.epfc.c4119.account.model;

public class ComptePayant extends Compte {
    private final float frais = 1.f;

    public ComptePayant(int code) {
        super(code);
    }

    @Override
    public void verser(float montant) {
        solde += montant - frais;
    }

    @Override
    public void retirer(float montant) {
        solde += montant - frais;
    }
}
