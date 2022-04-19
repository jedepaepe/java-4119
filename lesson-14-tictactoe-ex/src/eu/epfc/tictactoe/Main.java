package eu.epfc.tictactoe;

import java.sql.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try (Connection connection = DriverManager.getConnection("jdbc:sqlite:tictactoe.db")) {
            String sql = "CREATE TABLE IF NOT EXISTS game (" +
                    "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                    "playerX TEXT," +
                    "playerO TEXT," +
                    "cases TEXT)";
            connection.createStatement().execute(sql);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        do {
            System.out.println();
            System.out.println("Choisissez parmi les options suivantes");
            System.out.println("C pour créer un jeu");
            System.out.println("R pour lister tous les jeux");
            System.out.println("U pour modifier un jeu");
            System.out.println("D pour supprimer un jeu");
            System.out.println("Q pour quitter l'application");
            String choice = in.nextLine();
            if (choice.equals("Q")) break;
            switch (choice) {
                case "C":
                    try (Connection connection = DriverManager.getConnection("jdbc:sqlite:tictactoe.db")) {
                        String sql = "INSERT INTO game (playerX, playerO, cases) VALUES(?,?,?)";
                        System.out.print("Nom du joueur X: ");
                        String playerX = in.nextLine();
                        System.out.print("Nom du joueur O: ");
                        String playerO = in.nextLine();
                        System.out.print("Valeur des cases: ");
                        String cases = in.nextLine();
                        PreparedStatement statement = connection.prepareStatement(sql);
                        statement.setString(1, playerX);
                        statement.setString(2, playerO);
                        statement.setString(3, cases);
                        statement.executeUpdate();
                    } catch (SQLException throwables) {
                        throwables.printStackTrace();
                    }
                    break;
                case "R":
                    try (Connection connection = DriverManager.getConnection("jdbc:sqlite:tictactoe.db")) {
                        String sql = "SELECT id, playerX, playerO, cases FROM game";
                        ResultSet resultSet = connection.createStatement().executeQuery(sql);
                        while(resultSet.next()) {
                            int id = resultSet.getInt(1);
                            String playerX = resultSet.getString(2);
                            String playerO = resultSet.getString(3);
                            String cases = resultSet.getString(4);
                            System.out.println(id + " " + playerX + " " + playerO + " " + cases);
                        }
                    } catch (SQLException throwables) {
                        throwables.printStackTrace();
                    }
                    break;
                case "U":
                    try (Connection connection = DriverManager.getConnection("jdbc:sqlite:tictactoe.db")) {
                        String sql = "UPDATE game SET playerX=?, playerO=?, cases=? WHERE id=?";
                        PreparedStatement statement = connection.prepareStatement(sql);
                        System.out.print("id du jeu: ");
                        int id = Integer.parseInt(in.nextLine());
                        System.out.print("playerX: ");
                        String playerX = in.nextLine();
                        System.out.print("playerO: ");
                        String playerO = in.nextLine();
                        System.out.print("cases: ");
                        String cases = in.nextLine();
                        statement.setString(1, playerX);
                        statement.setString(2, playerO);
                        statement.setString(3, cases);
                        statement.setInt(4, id);
                        statement.executeUpdate();
                    } catch (SQLException throwables) {
                        throwables.printStackTrace();
                    }
                    break;
                case "D":
                    try (Connection connection = DriverManager.getConnection("jdbc:sqlite:tictactoe.db")) {
                        String sql = "DELETE FROM game WHERE id=?";
                        PreparedStatement statement = connection.prepareStatement(sql);
                        System.out.print("id du jeu à supprimer: ");
                        int id = in.nextInt();
                        statement.setInt(1, id);
                        statement.executeUpdate();
                    } catch (SQLException throwables) {
                        throwables.printStackTrace();
                    }
                    break;
                default:
                    System.out.println("Choix non supporté");
            }
        } while(true);
    }
}
