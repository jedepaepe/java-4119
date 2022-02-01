package eu.epfc.demo.contact;

public class Contact extends Person {
    private String email;
    private String phone;

    // Contact(String, String, String, String)
    public Contact(String firstname, String lastname, String email, String phone) {
        super(firstname, lastname);
        this.email = email;
        this.phone = phone;
    }

    public Contact() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String getFullname() {
        return getFirstname() + " " + getLastname() + " " + phone;
    }
}
