package eu.epfc.j4119.holiday;

import java.sql.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection("jdbc:sqlite:holiday.db")) {
            String sql = "CREATE TABLE IF NOT EXISTS request (" +
                    "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                    "employee TEXT," +
                    "start TEXT," +
                    "end TEXT," +
                    "status TEXT)";
            System.out.println(sql);
            connection.createStatement().execute(sql);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        Scanner in = new Scanner(System.in);
        do {
            System.out.println();
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
                    break;
                case "2":
                    try (Connection connection = DriverManager.getConnection("jdbc:sqlite:holiday.db")) {
                        String sql = "INSERT INTO request (employee, start, end, status) VALUES(?,?,?,?)";
                        PreparedStatement statement = connection.prepareStatement(sql);
                        String employee = "Sylvie";
                        System.out.print("Début: ");
                        String start = in.nextLine();
                        System.out.print("Fin: ");
                        String end = in.nextLine();
                        String status = "REQUESTED";
                        statement.setString(1, employee);
                        statement.setString(2, start);
                        statement.setString(3, end);
                        statement.setString(4, status);
                        statement.executeUpdate();
                    } catch (SQLException throwables) {
                        throwables.printStackTrace();
                    }
                    break;
                case "3":
                    try (Connection connection = DriverManager.getConnection("jdbc:sqlite:holiday.db")) {
                        System.out.println("Demander l'id du congé à annuler");
                        int id = Integer.parseInt(in.nextLine());
                        String sql = "UPDATE request SET status='CANCELLED' WHERE id=?";
                        PreparedStatement statement = connection.prepareStatement(sql);
                        statement.setInt(1, id);
                        statement.executeUpdate();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                    break;
                default:
                    System.out.println("Le choix " + choice + " n'est pas connu");
            }
        } while (true);
    }
}
