/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package gui;

/**
 *
 * @author aurrera
 */
public abstract class Departamento extends javax.swing.JPanel {

    /**
     * Creates new form Departamento
     */
    public Departamento() {
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

        departamentoButton = new javax.swing.JButton();
        nombreLabel = new javax.swing.JLabel();
        responsableLabel = new javax.swing.JLabel();
        telefonoLabel = new javax.swing.JLabel();
        nombreText = new javax.swing.JTextField();
        responsableText = new javax.swing.JTextField();
        telefonoText = new javax.swing.JTextField();
        eliminarButton = new javax.swing.JButton();
        editarButton = new javax.swing.JButton();

        departamentoButton.setBackground(new java.awt.Color(204, 204, 255));

        nombreLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        nombreLabel.setForeground(new java.awt.Color(0, 51, 153));
        nombreLabel.setText("Nombre departamento:");

        responsableLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        responsableLabel.setForeground(new java.awt.Color(0, 51, 153));
        responsableLabel.setText("Responsable:");

        telefonoLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        telefonoLabel.setForeground(new java.awt.Color(0, 51, 153));
        telefonoLabel.setText("Telefono:");

        nombreText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreTextActionPerformed(evt);
            }
        });

        eliminarButton.setBackground(new java.awt.Color(255, 153, 153));
        eliminarButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        eliminarButton.setText("Eliminar");
        eliminarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarButtonActionPerformed(evt);
            }
        });

        editarButton.setBackground(new java.awt.Color(255, 255, 204));
        editarButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        editarButton.setText("Editar");
        editarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(departamentoButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(responsableLabel)
                            .addComponent(telefonoLabel)
                            .addComponent(nombreLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nombreText)
                            .addComponent(responsableText)
                            .addComponent(telefonoText, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(eliminarButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(editarButton)
                        .addGap(19, 19, 19)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(departamentoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreLabel)
                    .addComponent(nombreText, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(responsableLabel)
                    .addComponent(responsableText, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telefonoLabel)
                    .addComponent(telefonoText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editarButton)
                    .addComponent(eliminarButton))
                .addContainerGap(40, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void nombreTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreTextActionPerformed

    private void eliminarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarButtonActionPerformed
        eliminar();
    }//GEN-LAST:event_eliminarButtonActionPerformed

    private void editarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarButtonActionPerformed
        editar();
    }//GEN-LAST:event_editarButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton departamentoButton;
    protected javax.swing.JButton editarButton;
    protected javax.swing.JButton eliminarButton;
    private javax.swing.JLabel nombreLabel;
    protected javax.swing.JTextField nombreText;
    private javax.swing.JLabel responsableLabel;
    protected javax.swing.JTextField responsableText;
    private javax.swing.JLabel telefonoLabel;
    protected javax.swing.JTextField telefonoText;
    // End of variables declaration//GEN-END:variables

   abstract void eliminar();

    abstract void editar();
}
