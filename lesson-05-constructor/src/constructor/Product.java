package constructor;

// classe avec deux constructeurs (de signatures différentes):
// Product() qui identique au constructeur par défaut
// Product(String, String, double)
public class Product {
    String name;
    String description;
    double price;

    // java fournit une constructeur par défaut qui réserve un espace dans la mémoire pour l'objet
    // réserve un espace
    //          pour name (initialisé à null)
    //          pour description (initialisé à null)
    //          pour price (initialé 0)
    // ce constructeur est:
    // de signature Product()
    public Product() {
    }

    // constructeur pratique (par ex qui permet d'initialiser tous les champs)
    // signature Product(java.lang.String, java.lang.String, double)
    public Product(String n, String d, double p) {
        name = n;
        description = d;
        price = p;
    }

    public static void main(String[] args) {
        Product pain = new Product("pain", "pain gris", 2);
        System.out.println(pain.name + " " + pain.description + " " + pain.price + "€");

        Product autreProduit = new Product();
    }
}
