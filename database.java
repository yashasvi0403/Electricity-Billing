package Electricity.billing;
import java.sql.*;
public class database {
    Connection connection;
    Statement statement;
    database(){
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bill_system","root","chinnu2005");
            statement = connection.createStatement();
            System.out.println("query is executed check status");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}