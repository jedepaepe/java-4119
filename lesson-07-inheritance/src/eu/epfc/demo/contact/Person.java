package eu.epfc.demo.contact;

public class Person {
    private String firstname;
    private String lastname;

    // Person(String, String)
    public Person(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    // Person()
    public Person() {}

    // getFirstname()
    public String getFirstname() {
        return firstname;
    }

    // setFirstname(String)
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFullname() {
        return firstname + " " + lastname;
    }
}
