/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;

import clases.DepartamentoClass;

/**
 *
 * @author aurrera
 */
public class DepartamentoNuevo extends Departamento{

    public DepartamentoNuevo() {
   nombreText.setEnabled(true);
   nombreText.setText("");
   responsableText.setEnabled(true);
   responsableText.setText("");
   telefonoText.setEnabled(true);
   telefonoText.setText("");
   eliminarButton.setVisible(false);
    editarButton.setVisible(false);
        
    }
    DepartamentoClass getDepartamentoClass(){
        String nombre = nombreText.getText();
        String responsable = responsableText.getText();
        String telefono = telefonoText.getText();
       DepartamentoClass departamentoClass = new DepartamentoClass(nombre,responsable, telefono);
       return departamentoClass;
    }

    @Override
    void eliminar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    void editar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
