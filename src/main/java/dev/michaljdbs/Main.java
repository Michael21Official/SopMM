package dev.michaljdbs;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {


        
//        try {
            QueryExecutor.executeQuery("INSERT INTO client (id, name, email, phone) VALUES\n" +
                    "(7,'John Smith', 'john.smith@example.com', '123-456-7890'),\n" +
                    "(8,'Jane Doe', 'jane.doe@example.com', '555-555-1212'),\n" +
                    "(9,'Robert Johnson', 'robert.johnson@example.com', '555-123-4567')");
//            ResultSet result = QueryExecutor.executeSelect("SELECT * FROM client;") ;
//            result.next();
//            String userName = result.getString("name");
//            System.out.println("Znaleziono: "+ userName);
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }

    }
}
