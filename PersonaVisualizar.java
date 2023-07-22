/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;

import acciones.PersonaAcciones;
import clases.PersonaClass;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author aurrera
 */
public class PersonaVisualizar extends Persona{
    
    final PersonaClass personaClass;
   
    public PersonaVisualizar(PersonaClass personaClass){
        this.personaClass = personaClass;
        nombreText.setEditable(false);
        nombreText.setText(personaClass.nombre);
        telefonoText.setEditable(false);
        telefonoText.setText(personaClass.telefono);
        emailText.setEditable(false);
        emailText.setText(personaClass.email);
        cubiculoText.setEditable(false);
        cubiculoText.setText(personaClass.cubiculo);
        departamentoText.setEditable(false);
        departamentoText.setText(personaClass.departamento);
        eliminarButton.setVisible(true);
        editarButton.setVisible(true);
        
        
    }

    @Override
    void eliminar() {
        try {
            PersonaAcciones.eliminarPersona(personaClass);
            directorio.Directorio.personas.eliminarPersona(this);
        } catch (SQLException ex) {
            Logger.getLogger(PersonaVisualizar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
