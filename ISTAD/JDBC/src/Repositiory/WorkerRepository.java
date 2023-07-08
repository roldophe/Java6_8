package Repositiory;

import Model.Worker;

import java.util.List;
import java.sql.*;
import java.util.ArrayList;

public class WorkerRepository {
    public static final String url = "jdbc:postgresql://localhost:5432/java6_db";
    public static final String username = "postgres";
    public static final String password = "Radom1771";
    public static final String SELECT_ALL = """
            select * from  worker_tb
            """;
    public static final String INSERT_RECORD = """
            INSERT INTO worker_tb
            (worker_name,worker_gender,worker_age,address,"date",worker_salary)
            VALUES(?,?,?,?,?,?);
            """;
    public static final String UPDATE_RECORD = """
            UPDATE worker_tb SET
            worker_name=?,
            worker_gender=?,
            worker_age=?,
            address=?,
            "date"=?,worker_salary=?
            WHERE worker_id=?;
            """;
    public static final String DELETE_RECORD = """
            DELETE FROM worker_tb WHERE worker_id=?
            """;

    public static List<Worker> getAllWorker() {
        try (Connection connection = DriverManager.getConnection(url, username, password);
             Statement statement = connection.createStatement()) {


            List<Worker> workerList = new ArrayList<>();
            ResultSet rs = statement.executeQuery(SELECT_ALL);
            while (rs.next()) {
                workerList.add(new Worker(
                        rs.getInt("worker_id"),
                        rs.getString("worker_name"),
                        rs.getString("worker_gender"),
                        rs.getInt("worker_age"),
                        rs.getString("address"),
                        rs.getString("date"),
                        rs.getDouble("worker_salary")
                ));
            }
            return workerList;

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error!" + e.getMessage());
            return null;
        }
    }

    public static void insertWorker(Worker worker) throws SQLException {
        try (
                Connection connection = DriverManager.getConnection(url, username, password);
                PreparedStatement preparedStatement = connection.prepareStatement(INSERT_RECORD)) {
            preparedStatement.setString(1, worker.getName());
            preparedStatement.setString(2, worker.getGender());
            preparedStatement.setInt(3, worker.getAge());
            preparedStatement.setString(4, worker.getAddress());
            preparedStatement.setString(5, worker.getDate());
            preparedStatement.setDouble(6, worker.getSalary());
            preparedStatement.executeUpdate();
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("Error! " + ex.getMessage());
        }

    }

    public static void updateWorker(Worker worker) throws SQLException {
        try (Connection connection = DriverManager.getConnection(url, username, password);
             PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_RECORD)) {
            preparedStatement.setString(1, worker.getName());
            preparedStatement.setString(2, worker.getGender());
            preparedStatement.setInt(3, worker.getAge());
            preparedStatement.setString(4, worker.getAddress());
            preparedStatement.setString(5, worker.getDate());
            preparedStatement.setDouble(6, worker.getSalary());
            preparedStatement.setInt(7, worker.getWorkerId());
            preparedStatement.executeUpdate();
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("Error! " + ex.getMessage());
        }
    }

    public static void deleteWorker(int id) throws SQLException {
        try (Connection connection = DriverManager.getConnection(url, username, password);
             PreparedStatement preparedStatement = connection.prepareStatement(DELETE_RECORD)) {
            preparedStatement.setInt(1, id);
            //delete by unique (primary key) => where clause -> WHERE column =Pk
            preparedStatement.executeUpdate();

        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("Error!" + ex.getMessage());
        }
    }
}
