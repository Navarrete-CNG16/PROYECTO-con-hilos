/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Desktop;

import java.awt.event.ActionEvent;

/**
 *
 * @author CLAUDIA NAVARRETE
 */
public class Ejemplo2 extends javax.swing.JInternalFrame {

    /**
     * Creates new form Ventana1JInternalFrame
     */
    public Ejemplo2() {
        initComponents();
         fueg.start();
         Alarma.setVisible(false);
    }
     
    Thread fueg= new Thread(){
      public void run(){
          try{
               fueg.sleep(50);
               int i=0;
              for(i=0;i>=0;i++){
                 System.out.println("No hay fuego");
              if(Ayuda.isSelected()){
                  fuegoo.setText("FUEGOOO");
                   fuegoo.setForeground(new java.awt.Color(204,0,0));
                   Alarma.setVisible(true);
                   System.out.println("Hay fuego");
                   
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/alarma-de-incendios (1).png")));
        jLabel2.setText("jLabel2");
               }
               else{
                  fuegoo.setText("NO! Hay FUEGO");
                  fuegoo.setForeground(new java.awt.Color(0,0,0));
                    Alarma.setVisible(false);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/BotonIniciarH.png"))); // NOI18N
        jLabel2.setText("jLabel2");
               }
              }
          }catch(InterruptedException ex){
                  System.out.println("Interrupcion en el Hilo");
              }
          }};
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Alarma = new javax.swing.JLabel();
        fuegoo = new javax.swing.JLabel();
        Ayuda = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        Salida = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Ejercicio 2");

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("Alarma de Fuego");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 151, 43));

        Alarma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/alarma-de-incendiosGrande.png"))); // NOI18N
        jPanel1.add(Alarma, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, 239, -1));

        fuegoo.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        fuegoo.setText("NO! Hay FUEGO");
        jPanel1.add(fuegoo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 190, 33));

        Ayuda.setToolTipText("Hay Fuego");
        Ayuda.setContentAreaFilled(false);
        Ayuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AyudaActionPerformed(evt);
            }
        });
        jPanel1.add(Ayuda, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 20, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/BotonIniciarH.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 120, -1));

        Salida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salida.png"))); // NOI18N
        Salida.setContentAreaFilled(false);
        Salida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalidaActionPerformed(evt);
            }
        });
        jPanel1.add(Salida, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 290, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalidaActionPerformed
  
      fueg.stop();
             
       // fueg.suspend();
     
    }//GEN-LAST:event_SalidaActionPerformed

    private void AyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AyudaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AyudaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Alarma;
    private javax.swing.JRadioButton Ayuda;
    private javax.swing.JButton Salida;
    private javax.swing.JLabel fuegoo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
