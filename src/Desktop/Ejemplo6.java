
package Desktop;
import java.awt.Color;
import java.util.Observable;
import java.util.Observer;
/**
 *
 * @author CLAUDIA NAVARRETE
 */
public class Ejemplo6 extends javax.swing.JInternalFrame implements Observer{

    private Thread[] hilos; //esto es porque necesito pararlos
    
    public Ejemplo6() {
        initComponents();
         hilos= new Thread[6];
    }
     private void terminar(){
         for(int i=0; i<hilos.length;i++){
             hilos[i].interrupt();
         }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        ganador = new javax.swing.JLabel();
        pg1 = new javax.swing.JProgressBar();
        pg2 = new javax.swing.JProgressBar();
        pg3 = new javax.swing.JProgressBar();
        pg4 = new javax.swing.JProgressBar();
        pg5 = new javax.swing.JProgressBar();
        pg6 = new javax.swing.JProgressBar();
        cuadropintar = new javax.swing.JPanel();
        frida = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("El pintor");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pintor.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel1.setText("Al pintor se le callo la pintura");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pintura1.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pintura2.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pintura3.png"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pintura4.png"))); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pintura5.png"))); // NOI18N

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pintura6.png"))); // NOI18N

        ganador.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        ganador.setText("Color");

        pg1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        pg1.setForeground(new java.awt.Color(204, 0, 0));
        pg1.setStringPainted(true);

        pg2.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        pg2.setForeground(new java.awt.Color(0, 102, 153));
        pg2.setStringPainted(true);

        pg3.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        pg3.setForeground(new java.awt.Color(255, 204, 0));
        pg3.setStringPainted(true);

        pg4.setBackground(new java.awt.Color(0, 153, 0));
        pg4.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        pg4.setForeground(new java.awt.Color(51, 153, 0));
        pg4.setStringPainted(true);

        pg5.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        pg5.setForeground(new java.awt.Color(102, 102, 255));
        pg5.setStringPainted(true);

        pg6.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        pg6.setForeground(new java.awt.Color(255, 51, 0));
        pg6.setStringPainted(true);

        cuadropintar.setBackground(new java.awt.Color(255, 255, 255));
        cuadropintar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 51, 0)));

        frida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/frida-kahlo.png"))); // NOI18N
        frida.setContentAreaFilled(false);
        frida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fridaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout cuadropintarLayout = new javax.swing.GroupLayout(cuadropintar);
        cuadropintar.setLayout(cuadropintarLayout);
        cuadropintarLayout.setHorizontalGroup(
            cuadropintarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cuadropintarLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(frida, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        cuadropintarLayout.setVerticalGroup(
            cuadropintarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cuadropintarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(frida, javax.swing.GroupLayout.PREFERRED_SIZE, 129, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(1, 1, 1)))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pg2, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                    .addComponent(pg3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pg6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pg5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pg4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pg1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cuadropintar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ganador, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(380, 380, 380)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 11, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pg1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(pg2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(pg3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(pg4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(pg5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(pg6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(ganador, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cuadropintar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(330, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fridaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fridaActionPerformed
        this.frida.setEnabled(false);
        this.ganador.setText("");
        
        for(int i=0; i<hilos.length;i++){
        //creo el primer bote de pintura
        pintor p= new pintor((i+1)+"");
        p.addObserver(this);//nueva notificacion actualizate
        hilos[i]= new Thread(p);
        hilos[i].start();
        }
    }//GEN-LAST:event_fridaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel cuadropintar;
    private javax.swing.JButton frida;
    private javax.swing.JLabel ganador;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar pg1;
    private javax.swing.JProgressBar pg2;
    private javax.swing.JProgressBar pg3;
    private javax.swing.JProgressBar pg4;
    private javax.swing.JProgressBar pg5;
    private javax.swing.JProgressBar pg6;
    // End of variables declaration//GEN-END:variables

    @Override
    public void update(Observable o, Object arg) {
        //Quien me lo recibe "el porcentaje"
       pintor p= (pintor) o; //casteo para ver cual es el nombre
       int porcentaje= (int) arg;
       
       switch(p.getBote()){
           case "1":
               this.pg1.setValue(porcentaje);
               break;
           case "2":
               this.pg2.setValue(porcentaje);
               break;
           case "3":
               this.pg3.setValue(porcentaje);
               break;
           case "4":
               this.pg4.setValue(porcentaje);
               break;
           case "5":
               this.pg5.setValue(porcentaje);
               break;
           case "6":
               this.pg6.setValue(porcentaje);
               break;
       }
         
       if(porcentaje>=100){
           terminar();
           this.frida.setEnabled(true);
           this.ganador.setText("Pintura "+ p.getBote());
             switch(p.getBote()){
           case "1":
               this.cuadropintar.setBackground(new java.awt.Color(204,0,0));
               break;
           case "2":
               this.cuadropintar.setBackground(new java.awt.Color(0,102,153));
               break;
           case "3":
               this.cuadropintar.setBackground(new java.awt.Color(255,255,102));
               break;
           case "4":
               this.cuadropintar.setBackground(new java.awt.Color(102,255,102));
               break;
           case "5":
               this.cuadropintar.setBackground(new java.awt.Color(102,102,255));
               break;
           case "6":
               this.cuadropintar.setBackground(new java.awt.Color(255,102,0));
               break;
                    }
           
            }
    }
}
