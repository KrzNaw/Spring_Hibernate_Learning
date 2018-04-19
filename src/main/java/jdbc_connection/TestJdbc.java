package jdbc_connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestJdbc {

    public static void main(String[] args) {

        String jdbcUrl = "jdbc:mysql://localhost:3306/hb_student_tracker?usesSSL=false";
        String user = "hbstudent";
        String password = "hbstudent";
        Connection connection = null;


        try{
            System.out.println("Connecting to db");

            connection = DriverManager.getConnection(jdbcUrl, user, password);


            System.out.println("We are connected to the DB, for fuck sake!!!");

        } catch (SQLException e) {

            System.out.println("SQL Exception occured.");
            e.printStackTrace();
        }
    }

}
