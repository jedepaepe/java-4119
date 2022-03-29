package eu.epfc.demoobject;

import java.util.Arrays;

public class Contact implements Comparable<Contact> {
    private String firstname;
    private String lastname;
    private String email;

    @Override
    public int hashCode() {
        return firstname.hashCode() + lastname.hashCode() + email.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (! (obj instanceof Contact)) return false;
        Contact other = (Contact) obj;
        boolean result = firstname.equals(other.firstname)
                && lastname.equals(other.lastname)
                && email.equals(other.email);
        return result;
    }

    public Contact(String firstname, String lastname, String email) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static void main(String[] args) {
        Contact c1 = new Contact("Marie", "De Brouckère", "m.b@epfc.eu");
        Contact c2 = new Contact("Yves", "De Strombeek", "y.d@epfc.eu");
        Contact c3 = new Contact("Marie", "De Brouckère", "m.b@epfc.eu");
        Contact c4 = new Contact("Aline", "Gomez", "a.g@epfc.eu");
//        System.out.println(c1.equals(c2));
//        System.out.println(c1.equals(c3));
//        System.out.println(c1.equals(new ExtendsObject()));
//        System.out.println(c1.equals(null));
//        System.out.println(c1.equals(new Object()));
        System.out.println(c1.compareTo(c2) + " " + ('M' - 'Y'));
        System.out.println(c1.compareTo(c3));
        System.out.println(c1.compareTo(c4) + " " + ('M' - 'A'));
        Contact[] contacts = {c1, c2, c3, c4};
        Arrays.sort(contacts);
        for (Contact c : contacts) {
            System.out.println(c.getFirstname());
        }
    }

    @Override
    public int compareTo(Contact contact) {
        return firstname.compareTo(contact.firstname);
    }
}
