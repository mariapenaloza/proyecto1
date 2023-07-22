/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author aurrera
 */
public class DepartamentoClass {
    long departamentoID;
    public final String nombre;
   public final String responsable;
    public final String telefono;

    public DepartamentoClass(String nombre, String responsable, String telefono) {
        this.nombre = nombre;
        this.responsable = responsable;
        this.telefono = telefono;
    }

    public DepartamentoClass(long departamentoID, String nombre, String responsable, String telefono) {
        this.departamentoID = departamentoID;
        this.nombre = nombre;
        this.responsable = responsable;
        this.telefono = telefono;
    }
    public void SetID(long departamentoID){
        this.departamentoID = departamentoID;
    }
    public long getID(){
        return departamentoID;
    }
 
}
