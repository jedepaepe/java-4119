package constructor;

public class Trein {
    String lineNr;
    int nrPassengers;
    String departureStation;
    String destinationStation;

    // généré par défaut avec alt+insert
    public Trein() {
    }

    public Trein(String lineNr, int nrPassengers, String departureStation, String destinationStation) {
        // this est un opérateur qui retourne l'objet courant
        // on peut le traduire par "moi", "moi l'objet"
        this.lineNr = lineNr;
        this.nrPassengers = nrPassengers;
        this.departureStation = departureStation;
        this.destinationStation = destinationStation;
    }

    // approche objet
    public void show() {
        // on n'est pas obligé d'écrire this (ici, c'est pour montrer // pédagogique)
        System.out.println(this.lineNr + " : " + this.departureStation + " => " + this.destinationStation);
    }

    // approche procédurale => elle est "à éviter"
    public static void showTrein(Trein t) {
        System.out.println(t.lineNr + " : " + t.departureStation + " => " + t.destinationStation);
    }

    public static void main(String[] args) {
        Trein liege = new Trein("100", 1200, "Bruxelles", "Liège");
        liege.show();
        showTrein(liege);

        System.out.println();

        Trein charleroi = new Trein("200", 1000, "Bruxelles", "Charleroi");
        charleroi.show();
        showTrein(charleroi);
        // show(this = charleroi);
    }
}
