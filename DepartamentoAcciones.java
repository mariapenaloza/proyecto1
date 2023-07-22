/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package acciones;

import clases.DepartamentoClass;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
/**
 *
 * @author aurrera
 */
public class DepartamentoAcciones {
    public static void guardarDepartamento(DepartamentoClass departamentoClass) throws SQLException{
        long id = insertarDepartamento(departamentoClass);
        departamentoClass.SetID(id);
    }

   static private long insertarDepartamento(DepartamentoClass departamentoClass) throws SQLException {
        String sql="insert into departamentos ( nombre, responsable, telefono) "
                + "values (?,?,?);";
        PreparedStatement ps = Conexion.PepareStatement(sql);
        ps.setString(1, departamentoClass.nombre);
        ps.setString(2, departamentoClass.responsable);
        ps.setString(3, departamentoClass.telefono);
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

    public static ArrayList<DepartamentoClass> obtenerDepartamentos()throws SQLException {
          String sql="select departamento_id, nombre, responsable, telefono from departamentos order by nombre";
        PreparedStatement ps = Conexion.PepareStatement(sql);
        ArrayList<DepartamentoClass>list = new ArrayList<>();
        try(ResultSet rs = ps.executeQuery()){
            while (rs.next()){
                long id = rs.getLong("departamento_id");
                String nombre = rs.getString("nombre");
                String responsable = rs.getString("responsable");
                String telefono = rs.getString("telefono");
                DepartamentoClass departamentoClass = new DepartamentoClass(id, nombre, responsable, telefono);
                list.add(departamentoClass);
            }
        }
        return list;
 
    }

    public static void eliminarDepartamento(DepartamentoClass departamentoClass) throws SQLException {
        String sql = "delete from departamentos where departamento_id=?";
        PreparedStatement ps = Conexion.PepareStatement(sql);
        ps.setLong(1, departamentoClass.getID());
        ps.execute();

        
    }

    public static void editarDepartamento(DepartamentoClass departamentoClass) throws SQLException {
        String sql = "update departamentos set nombre, responsable, telefono from departamentos order by nombre";
        PreparedStatement ps = Conexion.PepareStatement(sql);
        ps.setLong(1, departamentoClass.getID());
        ps.execute();        
    }
  
    
}
