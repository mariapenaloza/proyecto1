/* 
To change this license heater, choose 
*/
package acciones;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement; 
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author aurrera
 */
public class Conexion {
    private static Connection connection;
    public final static Conexion instancia = new Conexion();
    
    /** 
     * Prepara senencias SQL 
     * @param sql: Instruccion SQL a preparar
     * @return La instruccion preparada 
     * @throws SQLException
     */
    public static PreparedStatement PepareStatement(String sql) throws SQLException{
        return connection.prepareStatement(sql);
        
    }
    /**
     *  Cierra la conexion
     * @throws SQLException
     */
    public static void cerrar()throws SQLException {
        connection.close();
    }        
    /**
     * Se usa mas bien para hacer inserciones y obtener la sllaves creadas auomaticamente 
     * @param sql: Instriccion SQL a preparar
     * @param b: puede ser cualquier cosa...
     * @return La instruccion preparada 
     * @throws SQLException
    */
    public static PreparedStatement PepareStatement(String sql, boolean b) throws SQLException{
        return connection.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
    }
    
    private Conexion(){
        String cadena = "jdbc:sqlite:directorio.db";
        try{
            connection = DriverManager.getConnection(cadena);
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

/*private static Connection connection;
        private static final String DB_NAME = "directorio.db";

    private Conexion() {
        try {
            String url = "jdbc:sqlite:" + DB_NAME;
            connection = DriverManager.getConnection(url);
            System.out.println("//Conectando//");
        } catch (SQLException e) {
            System.err.println("Error al conectar a la base de datos: " + e.getMessage());
        }
    }

    public static Connection getConnection() {
        if (connection == null) {
            new Conexion();
        }
        return connection;
         }
*/
