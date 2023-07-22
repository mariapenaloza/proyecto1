/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;

import acciones.DepartamentoAcciones;
import clases.DepartamentoClass;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author aurrera
 */
public class DepartamentoVisualizar extends Departamento{
    final DepartamentoClass departamentoClass;

    public DepartamentoVisualizar(DepartamentoClass departamentoClass) {
        this.departamentoClass = departamentoClass;
        nombreText.setEditable(false);
        nombreText.setText(departamentoClass.nombre);
        responsableText.setEditable(false);
        responsableText.setText(departamentoClass.responsable);
        telefonoText.setEditable(false);
        telefonoText.setText(departamentoClass.telefono);
        eliminarButton.setVisible(true);
        editarButton.setVisible(true);
        
    }

    @Override
    void eliminar() {
        try {
            DepartamentoAcciones.eliminarDepartamento(departamentoClass);
            directorio.Directorio.principal.eliminarDepartamento(this);
        } catch (SQLException ex) {
            Logger.getLogger(DepartamentoVisualizar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    void editar() {
        try {
            DepartamentoAcciones.editarDepartamento(departamentoClass);
            directorio.Directorio.principal.editarDepartamento(this);
        } catch (SQLException ex) {
            Logger.getLogger(DepartamentoVisualizar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}
