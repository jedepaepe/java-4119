package eu.epfc.c4119.consoleexercice;

import java.util.Scanner;

public class ContactForm {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("-------------------------------------------------------");
        System.out.println("------------------CONTACT-FORM-------------------------");
        System.out.println("-------------------------------------------------------");
        System.out.print("prénom : ");
        String firstname = keyboard.nextLine();
        System.out.print("nom de famille : ");
        String lastname = keyboard.nextLine();
        System.out.print("courriel : ");
        String email = keyboard.nextLine();
        System.out.print("téléphone : ");
        String phone = keyboard.nextLine();
        Contact contact = new Contact(firstname, lastname, email, phone);

        System.out.println("-------------------------------------------------------");
        System.out.println("Contact enregistré");
        System.out.println("prénom : " + contact.getFirstname());
        System.out.println("nom de famille : " + contact.getLastname());
        System.out.println("courriel : " + contact.getEmail());
        System.out.println("télépone : " + contact.getPhone());

        System.out.print("Pour confirmer, tapez S : ");
        String command = keyboard.nextLine();
        if (command.equals("S")) {
            // todo : enregistrer le contact dans la db
            System.out.println("Contact enregistrer dans la DB");
        } else {
            System.out.println("Pas enregistré");
        }
    }
}
