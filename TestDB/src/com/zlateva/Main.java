package com.zlateva;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

    public static void main(String[] args) {

//        try (Connection conn =DriverManager.getConnection("jdbc:sqlite:testjava.db")){
//            Statement statement = conn.createStatement();
//            statement.execute("CREATE TABLE contacts (name TEXT, phone INTEGER, email TEXT)");
        try {
            Connection conn = DriverManager.getConnection("jdbc:sqlite:testjava.db");
//            conn.setAutoCommit(false);
            Statement statement = conn.createStatement();
            //    statement.execute("DROP TABLE IF EXISTS contacts");
            statement.execute("CREATE TABLE IF NOT EXISTS" +
                    " contacts (name TEXT, phone INTEGER, email TEXT)");
//            statement.execute("INSERT INTO contacts (name, phone, email)" +
//                    "VALUES('Jim', 5663225, 'jim@email.com')");
//            statement.execute("INSERT INTO contacts (name, phone, email)" +
//                    "VALUES('Jane', 4829484, 'jane@email.com')");
//            statement.execute("INSERT INTO contacts (name, phone, email)" +
//                    "VALUES('Frido', 54545, 'dog@email.com')");

//            statement.execute("UPDATE contacts SET phone=5566789 WHERE name = 'Jane'");
//            statement.execute("DELETE FROM contacts WHERE name = 'Frido'");

//            statement.execute("SELECT * FROM contacts");
//            ResultSet results = statement.getResultSet();
            ResultSet results = statement.executeQuery("SELECT * FROM contacts");
            while (results.next()) {
                System.out.println(results.getString("name") + " " +
                        results.getInt("phone") + " " +
                        results.getString("email"));
            }

            results.close();
            statement.close();
            conn.close();

        } catch (SQLException e) {
            System.out.println("Something went wrong: " + e.getMessage());
        }
    }
}