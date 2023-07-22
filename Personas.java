/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import acciones.PersonaAcciones;
import clases.PersonaClass;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author aurrera
 */
public class Personas extends javax.swing.JFrame {
    static  void mostrarlos(){
       Personas personas = new Personas();
     //   crearPersonas.cargarWidget();
       personas.setVisible(true);
        personas.requestFocus();
            }
            ArrayList <PersonaVisualizar> personasList = new ArrayList <>();

    /**
     * Creates new form Personas
     */
    public Personas() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tituloPanel = new javax.swing.JPanel();
        tituloLabel = new javax.swing.JLabel();
        personaltituloButton = new javax.swing.JButton();
        actividadesLabel = new javax.swing.JLabel();
        agregarButton = new javax.swing.JButton();
        departamentosButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        personasPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Personal");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        tituloPanel.setBackground(new java.awt.Color(255, 255, 255));

        tituloLabel.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        tituloLabel.setForeground(new java.awt.Color(0, 51, 153));
        tituloLabel.setText("Directorio Organizacional");

        javax.swing.GroupLayout tituloPanelLayout = new javax.swing.GroupLayout(tituloPanel);
        tituloPanel.setLayout(tituloPanelLayout);
        tituloPanelLayout.setHorizontalGroup(
            tituloPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tituloPanelLayout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addComponent(tituloLabel)
                .addContainerGap(184, Short.MAX_VALUE))
        );
        tituloPanelLayout.setVerticalGroup(
            tituloPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tituloPanelLayout.createSequentialGroup()
                .addGap(0, 27, Short.MAX_VALUE)
                .addComponent(tituloLabel))
        );

        personaltituloButton.setBackground(new java.awt.Color(0, 0, 153));
        personaltituloButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        personaltituloButton.setForeground(new java.awt.Color(255, 255, 255));
        personaltituloButton.setText("Personal");

        actividadesLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        actividadesLabel.setForeground(new java.awt.Color(0, 0, 102));
        actividadesLabel.setText("Actividades");

        agregarButton.setBackground(new java.awt.Color(204, 204, 255));
        agregarButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        agregarButton.setText("Agregar");
        agregarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarButtonActionPerformed(evt);
            }
        });

        departamentosButton.setBackground(new java.awt.Color(204, 204, 255));
        departamentosButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        departamentosButton.setText("Departamentos");
        departamentosButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                departamentosButtonActionPerformed(evt);
            }
        });

        personasPanel.setBackground(new java.awt.Color(255, 255, 255));
        personasPanel.setLayout(new javax.swing.BoxLayout(personasPanel, javax.swing.BoxLayout.Y_AXIS));
        jScrollPane1.setViewportView(personasPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tituloPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(personaltituloButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(departamentosButton, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                                    .addComponent(agregarButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(24, 24, 24))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(actividadesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(61, 61, 61))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(personaltituloButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(actividadesLabel)
                        .addGap(29, 29, 29)
                        .addComponent(agregarButton)
                        .addGap(44, 44, 44)
                        .addComponent(departamentosButton)
                        .addGap(0, 258, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void agregarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarButtonActionPerformed
        CrearPersona.mostrar();
    }//GEN-LAST:event_agregarButtonActionPerformed

    private void departamentosButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_departamentosButtonActionPerformed
                        Principal.mostrarlos();

    }//GEN-LAST:event_departamentosButtonActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        cargarPersonas();
    }//GEN-LAST:event_formWindowOpened



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel actividadesLabel;
    private javax.swing.JButton agregarButton;
    private javax.swing.JButton departamentosButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton personaltituloButton;
    private javax.swing.JPanel personasPanel;
    private javax.swing.JLabel tituloLabel;
    private javax.swing.JPanel tituloPanel;
    // End of variables declaration//GEN-END:variables



       void agregarPersona(PersonaClass personaClass) {
        PersonaVisualizar personaVisualizar = new PersonaVisualizar(personaClass);
        personasList.add(personaVisualizar);
        personasPanel.add(personaVisualizar);
        validate();


        }

    private void cargarPersonas() {
        try {
            ArrayList<PersonaClass> personas = PersonaAcciones.obtenerPersonas();
            personasList.clear();
            personasPanel.removeAll();
            for (PersonaClass persona : personas){
                PersonaVisualizar personaVisualizar = new PersonaVisualizar(persona);
                personasList.add(personaVisualizar);
                personasPanel.add(personaVisualizar);
                
            }
            validate();
        } catch (SQLException ex) {
            Logger.getLogger(Personas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

   

    void eliminarPersona(PersonaVisualizar persona) {
        personasList.remove(persona);
        personasPanel.remove(persona);
        validate();
    }
 }
        
     

 
    


  
    


