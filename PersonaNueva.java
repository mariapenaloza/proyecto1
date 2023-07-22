/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;

import clases.PersonaClass;

/**
 *
 * @author aurrera
 */
public class PersonaNueva extends Persona{

   
    public PersonaNueva(){
        nombreText.setEnabled(true);
        nombreText.setText("");
        telefonoText.setEnabled(true);
        telefonoText.setText("");
         emailText.setEnabled(true);
        emailText.setText("");
         cubiculoText.setEnabled(true);
        cubiculoText.setText("");
        departamentoText.setEnabled(true);
        departamentoText.setText("");
        eliminarButton.setVisible(false);
        editarButton.setVisible(false);
        
        
    }

   PersonaClass getPersonaClass(){
       String nombre = nombreText.getText();
       String telefono = telefonoText.getText();
       String email = emailText.getText();
       String cubiculo = cubiculoText.getText();
       String departamento = departamentoText.getText();
       
       PersonaClass personaClass = new PersonaClass(nombre, telefono, email, cubiculo, departamento);
       return personaClass;
   }

    @Override
    void eliminar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
