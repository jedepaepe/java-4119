package holiday;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainRefactor1 {
    public static void main(String[] args) {
        initializeDB();
        run();
    }

    private static void run() {
        Scanner in = new Scanner(System.in);
        do {
            String choice = showMenu(in);
            if (choice.equals("Q")) break;
            switch (choice) {
                case "1":
                    showRequests();
                    break;
                case "2":
                    createRequest(in);
                    break;
                case "3":
                    cancelRequest(in);
                    break;
                default:
                    System.out.println("Le choix " + choice + " n'est pas connu");
            }
        } while (true);
    }

    private static String showMenu(Scanner in) {
        System.out.println();
        System.out.println("Choisissez parmi les options suivantes");
        System.out.println("1. lister les demandes de congé");
        System.out.println("2. demander un nouveau congé");
        System.out.println("3. annuler une demande de congé");
        System.out.println("Q. quitter l'application");
        String choice = in.nextLine();
        return choice;
    }

    private static void cancelRequest(Scanner in) {
        int id = cancelRequestUI(in);
        cancelRequestDB(id);
    }

    private static void cancelRequestDB(int id) {
        try (Connection connection = DriverManager.getConnection("jdbc:sqlite:holiday.db")) {
            String sql = "UPDATE request SET status='CANCELLED' WHERE id=?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, id);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static int cancelRequestUI(Scanner in) {
        System.out.println("Demander l'id du congé à annuler");
        int id = Integer.parseInt(in.nextLine());
        return id;
    }

    private static void createRequest(Scanner in) {
        CreateRequestVM createRequestVM = createRequestUI(in);
        HolidayRequest request = createRequestBusiness(createRequestVM.start, createRequestVM.end);
        createRequestDB(request);
    }

    private static void createRequestDB(HolidayRequest request) {
        try (Connection connection = DriverManager.getConnection("jdbc:sqlite:holiday.db")) {
            String sql = "INSERT INTO request (employee, start, end, status) VALUES(?,?,?,?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, request.employee);
            statement.setString(2, request.start);
            statement.setString(3, request.end);
            statement.setString(4, request.status);
            statement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    private static HolidayRequest createRequestBusiness(String start, String end) {
        HolidayRequest request = new HolidayRequest();
        request.employee = "Sylvie";
        request.start = start;
        request.end = end;
        request.status = "REQUESTED";
        return request;
    }

    private static CreateRequestVM createRequestUI(Scanner in) {
        CreateRequestVM createRequestVM = new CreateRequestVM();
        System.out.print("Début: ");
        createRequestVM.start = in.nextLine();
        System.out.print("Fin: ");
        createRequestVM.end = in.nextLine();
        return createRequestVM;
    }

    private static void showRequests() {
        List<HolidayRequest> requests = findAllRequestsDB();
        showAllRequestsUI(requests);
    }

    private static void showAllRequestsUI(List<HolidayRequest> requests) {
        for(HolidayRequest request : requests) {
            System.out.println(request);
        }
    }

    private static List<HolidayRequest> findAllRequestsDB() {
        List<HolidayRequest> requests = new ArrayList<>();
        try (Connection connection = DriverManager.getConnection("jdbc:sqlite:holiday.db")) {
            String sql = "SELECT id, employee, start, end, status FROM request";
            ResultSet resultSet = connection.createStatement().executeQuery(sql);
            while (resultSet.next()) {
                HolidayRequest request = new HolidayRequest();
                request.id = resultSet.getInt(1);
                request.employee = resultSet.getString(2);
                request.start = resultSet.getString(3);
                request.end = resultSet.getString(4);
                request.status = resultSet.getString(5);
                requests.add(request);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return requests;
    }

    private static void initializeDB() {
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
    }
}