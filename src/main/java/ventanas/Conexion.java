
package ventanas;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author darli
 */
public class Conexion {
    
     Connection cn = null;
	
	public static Connection conector() {
		try {
			Connection cn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/usuarios","root", "020176");
			return cn;
                        
		} catch (SQLException e) {
			System.out.print(e);
                        return null;
		}
                
    }
    public static void main(String args[]){
         Connection cn = conector();
         System.out.print(cn);
    }
}
