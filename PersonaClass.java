/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author aurrera
 */
public class PersonaClass {
    long personaID;
     public final String nombre;
    public final String telefono;
    public final String email;
    public final String cubiculo;
    public final String departamento;

    public PersonaClass(String nombre, String telefono, String email, String cubiculo, String departamento) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
        this.cubiculo = cubiculo;
        this.departamento = departamento;
    }

    public PersonaClass(long personaID, String nombre, String telefono, String email, String cubiculo, String departamento) {
        this.personaID = personaID;
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
        this.cubiculo = cubiculo;
        this.departamento = departamento;
    }
 

    public void setID(long id) {
    this.personaID = personaID;

    }
     public long getID(){
        return personaID;
    }
    
        
}
