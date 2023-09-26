package Gym_management;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class TestCon{
    public static void main(String[] args){
        try{
            Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/hello","root","");
            Statement statement=connection.createStatement();
            ResultSet resultSet=statement.executeQuery("select * from table1");
            while(resultSet.next()){
                System.out.println(resultSet.getString("Name"));
                
            }
            
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
}