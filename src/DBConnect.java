/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author icre
 */
import java.sql.*;

public class DBConnect {
    Connection con=null;
    
    public Connection getConnect()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/proj_db","root","");
        }
        catch(Exception e)
        {
        }
        return con;
    }
}
