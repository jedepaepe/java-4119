package eu.epfc.c4119.account;

import eu.epfc.c4119.account.model.CompteSimple;

public class App {

    public static void main(String[] args) {
        CompteSimple cs1 = new CompteSimple(111, 1000);
        cs1.retirer(2000);
        System.out.println("solde est " + cs1.getSolde());

        cs1.verser(100_000);
    }
}
