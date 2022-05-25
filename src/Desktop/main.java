
package Desktop;

import javax.swing.DefaultListModel;

/**
 *
 * @author CLAUDIA NAVARRETE
 */
public class main  implements Runnable {
    DefaultListModel modelo=new DefaultListModel();
    public Thread hilo;
     String n_hilo;
   
   public void run() {
          modelo.addElement("  Main  \n");
         int i=1;
         for(i=1; i<6; i++){
            modelo.addElement("Main "+ i);
         //La lista de la ventana uno, se debe especificar bien, tipo como una ruta
              Ejemplo3.listamain.setModel(modelo);
             try{
                 Thread.sleep(1000);
             }catch(InterruptedException exc){
                 System.out.println("interrupcion en el Main");
             }
             
         }System.out.println("Termina Main");
    }
         
    }
