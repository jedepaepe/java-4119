package eu.epfc.j4119.holiday;

import jdk.jshell.spi.ExecutionControl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        do {
            System.out.println("Choisissez parmi les options suivantes");
            System.out.println("1. lister les demandes de congé");
            System.out.println("2. demander un nouveau congé");
            System.out.println("3. annuler une demande de congé");
            System.out.println("Q. quitter l'application");
            String choice = in.nextLine();
            if (choice.equals("Q")) break;
            switch (choice) {
                case "1":
                    try (Connection connection = DriverManager.getConnection("jdbc:sqlite:holiday.db")) {
                        String sql = "SELECT id, employee, start, end, status FROM request";
                        ResultSet resultSet = connection.createStatement().executeQuery(sql);
                        while (resultSet.next()) {
                            int id = resultSet.getInt(1);
                            String employee = resultSet.getString(2);
                            String start = resultSet.getString(3);
                            String end = resultSet.getString(4);
                            String status = resultSet.getString(5);
                            System.out.println(id + " " + employee + " " + start + " " + end + " " + status);
                        }
                    } catch (SQLException throwables) {
                        throwables.printStackTrace();
                    }
                    System.out.println("connection supprimée");
                    break;
                case "2":
                    System.out.println("Demande un congé TODO");
                    break;
                case "3":
                    System.out.println("Annuler une demande TODO");
                    break;
                default:
                    System.out.println("Le choix " + choice + " n'est pas connu");
            }
        } while (true);
    }
}
