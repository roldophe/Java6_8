package Repositiory;

import Model.Student;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

//this where we work with the database!!
public class StudentRepository {
    /*
    1. Connection String
    2. Username
    3. Password
    4. SQL Statement
     */

    private final static String url = "jdbc:postgresql://localhost:5432/java6_db"; //Connection
    private final static String username = "postgres"; //username
    private final static String password = "Radom1771"; //password
    private final static String INSERT_STUDENT = """
            INSERT INTO student_tb(student_name,student_age, gender, classroom,average)
            VALUES(?,?,?,?,?);
            """;
    private final static String UPDATE_STUDENT = """
            UPDATE student_tb SET
            student_name=?,
            student_age=?,
            gender=?,
            classroom=?,
            average=?
            WHERE student_id=?
            """;
    public static final String DELETE_STUDENT = """
            DELETE FROM student_tb WHERE student_id=?;
            """;
    public static List<Student> getALlStudents() { //Get All  Students From Database
        try (
                //get connection
                Connection connection = DriverManager.getConnection(url, username, password);
                //SQL statement
                Statement statement = connection.createStatement()
        ) {
            List<Student> students = new ArrayList<>();
            ResultSet resultSet = statement.executeQuery("select *from  student_tb");
            while (resultSet.next()) {
                students.add(new Student(
                        resultSet.getInt("student_id"),
                        resultSet.getString("student_name"),
                        resultSet.getString("gender"),
                        resultSet.getInt("student_age"),
                        resultSet.getString("classroom"),
                        resultSet.getDouble("average")
                ));
//                    System.out.println("Student ID: "+resultSet.getInt("student_id"));
//                    System.out.println("Student Name: "+resultSet.getString("student_name"));
//                    System.out.println("Student Gender: "+resultSet.getString("gender"));
//                    System.out.println("Student Age: "+resultSet.getInt("student_age"));
//                    System.out.println("Student Classroom: "+resultSet.getString("classroom"));
//                    System.out.println("Student Average: "+resultSet.getDouble("average"));
//                    System.out.println("---------------------------------------");
            }
            return students;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error Getting  All Students: " + e.getMessage());
            return null;
        }
    }

    public static void setInsertStudent(Student student) {
        try (Connection connection = DriverManager.getConnection(url, username, password); PreparedStatement preparedStatement = connection.prepareStatement(INSERT_STUDENT)) {
            preparedStatement.setString(1, student.getName());
            preparedStatement.setInt(2, student.getAge());
            preparedStatement.setString(3, student.getGender());
            preparedStatement.setString(4, student.getClassroom());
            preparedStatement.setDouble(5, student.getAverage());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error Inserting Student: " + e.getMessage());
        }

    }

    public static void setUpdateStudent(int id, Student student) {
        try (Connection connection = DriverManager.getConnection(url, username, password); PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_STUDENT)) {
            preparedStatement.setString(1, student.getName());
            preparedStatement.setInt(2, student.getAge());
            preparedStatement.setString(3, student.getGender());
            preparedStatement.setString(4, student.getClassroom());
            preparedStatement.setDouble(5, student.getAverage());
            preparedStatement.setInt(6, id);
            preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error Updating Student:  " + e.getMessage());
        }
    }

    public static void deleteStudent(int id) {
        try (Connection connection = DriverManager.getConnection(url, username, password); 
	PreparedStatement preparedStatement = connection.prepareStatement(DELETE_STUDENT)) {
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error Deleting Student: " + e.getMessage());
        }
    }
}
