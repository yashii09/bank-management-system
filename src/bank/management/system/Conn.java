package bank.management.system; 
/*register the driver
create connection
create statement
Execute query
close connection
*/
import java.sql.*;

public class Conn {
    
    Connection c;
    Statement s;
    
    public Conn(){
        try {
            c = DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem", "root", "Yashi@123#");
            s = c.createStatement();
            
        } catch (Exception e){
            System.out.println(e);
        }
        
        
    }
    
}
