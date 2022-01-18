package constructor;

// classe avec un constructeur explicite (on a écrit le code du constructeur)
// => le constructeur par défaut n'est plus fourni par java
public class House {
    String address;
    double superficie;
    boolean hasGarden;

    public House(String a, double s, boolean g) {
        address = a;
        superficie = s;
        hasGarden = g;
    }

    public static void main(String[] args) {
        House laeken = new House("Parc de Laeken", 2000, true);

        // Le constructeur par défaut n'est plus fourni s'il y a un autre constructeur
        // (mais on peut l'écrire soit même (voir Product)
        // House anyOne = new House();      // ne compile car le constructeur House() n'existe pas
    }
}
