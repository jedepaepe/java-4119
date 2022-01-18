package correction;

public class AppProduct {
    public static void main(String[] args) {
        Product pain = new Product();
        pain.name = "pain";
        pain.description = "pain campagne 800 gr";
        pain.price = 2.2;

        Product baguette = new Product();
        baguette.name = "baguette";
        baguette.description = "baguette rustique";
        baguette.price = 1.6;

        ProductCategory boulangerie = new ProductCategory();
        boulangerie.name = "boulangerie";
        boulangerie.description = "tous les produits de boulegerie";
        boulangerie.products[0] = pain;
        pain.productCategory = boulangerie;
        boulangerie.products[1] = baguette;

        showProductOfCategory(boulangerie);

        // beurre, lait, laiterie à faire pendant la pause
        Product beurre = createProduct("beurre", "beurre salé 250gr", 3.2);
    }

    static void showProductOfCategory(ProductCategory category) {
        System.out.println();
        System.out.println(category.name);
        for (Product p : category.products) {
            if (p != null) {
                System.out.println("\t" + p.name + " : " + p.price);
            }
        }
    }

    static Product createProduct(String name, String description, double price) {
        Product product = new Product();
/*      |       |             |
        |       |             constructeur (méthode: on a des parenthèses): crée l'objet en mémoire
        |       nom de la variable d'instance
        type (class) de l'objet
*/
        product.name = name;
        product.description = description;
        product.price = price;
        System.out.println(product.name + " " + product.description + " " + product.price);
        return product;
    }
}
