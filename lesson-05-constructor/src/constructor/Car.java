package constructor;

// classe sans constructeur explite
// => java fournit un constructeur par défaut (implicite)
// qui réserve l'espace mémoire nécessaire à l'objet
// => de l'espace pour name
// => de l'espace pour brand
// => de l'espace pour nrPassenger
public class Car {
    String name;
    String brand;
    int nrPassenger;

    public static void main(String[] args) {
        Car smart = new Car();  // ce constructeur est fourni par défaut
        smart.name = "smart";
        smart.brand = "Mercèdes";
        smart.nrPassenger = 2;
    }
}
