/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package directorio;

import clases.PersonaClass;
import gui.*;

/**
 *
 * @author aurrera
 */
public class Directorio {
    
  public static Principal principal;
public static Personas personas;

   
    public static void main(String[] args) {
        principal = new Principal();
        principal.setVisible(true);
        principal.requestFocus();
        
        personas = new Personas();
        personas.setVisible(false);
        personas.requestFocus();
        
        
    }

    
       



}
