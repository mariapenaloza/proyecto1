/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package acciones;

import clases.PersonaClass;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author aurrera
 */
public class PersonaAcciones {
    
    public static void guardarPersona(PersonaClass personaClass) throws SQLException{
        long id = insertarPersona(personaClass);
        personaClass.setID(id);
    }

   static  private long insertarPersona(PersonaClass personaClass) throws SQLException {
          String sql="insert into personas ( nombre, telefono, email, cubiculo, departamento) "
                + "values (?,?,?,?,?);";
        PreparedStatement ps = Conexion.PepareStatement(sql);
        ps.setString(1, personaClass.nombre);
        ps.setString(2, personaClass.telefono);
        ps.setString(3, personaClass.email);
        ps.setString(4, personaClass.cubiculo);
        ps.setString(5, personaClass.departamento);

        int id = 0;
        ps.execute();
        sql = "select last_insert_rowid();";
        ps = Conexion.PepareStatement(sql, true);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) { 
            id = rs.getInt(1);
        }
        return id;
    }

    public static ArrayList<PersonaClass> obtenerPersonas() throws SQLException {
           String sql="select persona_id, nombre, telefono, email, cubiculo, departamento from personas ";
         PreparedStatement ps = Conexion.PepareStatement(sql);
         ArrayList<PersonaClass> list = new ArrayList<>();
             try(ResultSet rs = ps.executeQuery()){
             while(rs.next()){
                 long id = rs.getLong("persona_id");
                 String nombre = rs.getString("nombre");
                 String telefono = rs.getString("telefono");
                 String email = rs.getString("email");
                 String cubiculo = rs.getString("cubiculo");
                 String departamento = rs.getString("departamento");
                 PersonaClass personaClass = new PersonaClass(id, nombre, telefono, email, cubiculo, departamento);
                 list.add(personaClass);
             }
         }
         return list;
    }

    public static void eliminarPersona(PersonaClass personaClass) throws SQLException {
         String sql="delete from personas where persona_id=?";
         PreparedStatement ps = Conexion.PepareStatement(sql);
         ps.setLong(1, personaClass.getID());
         ps.execute();
        
       }
}
