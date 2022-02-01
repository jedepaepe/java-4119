package eu.epfc.demo.contact;

public class App {
    public static void main(String[] args) {
        Person tintin = new Person("Tintin", "De Brusselar");
        System.out.println(tintin.getFullname());

        Contact asterix = new Contact("Astérix", "D'Armorique", "asterix@gaulois.fr", "001");
        System.out.println(asterix.getFullname());
        System.out.println(asterix.getEmail());
        System.out.println(asterix.getPhone());

        System.out.println();
        Person[] persons = { tintin, asterix };
        for(Person p : persons) {
            String s = p.getFullname();
            System.out.println(s);
        }

        Person asterixAsAPerson = new Person(asterix.getFirstname(), asterix.getLastname());
    }
}
