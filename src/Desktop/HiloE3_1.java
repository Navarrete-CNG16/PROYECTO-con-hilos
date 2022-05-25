
package Desktop;

import javax.swing.DefaultListModel;

/**
 *
 * @author CLAUDIA NAVARRETE
 */
public class HiloE3_1 implements Runnable {
    DefaultListModel modelo=new DefaultListModel();
    DefaultListModel modelo2=new DefaultListModel();
    public Thread hilo;
     String n_hilo;
     

private void SubHilo2() {
        int i=1;
        modelo.addElement("   SubHilo2 \n");
         for(i=1; i<11; i++){
          //  System.out.println("Subproceso Hilo 2");
             modelo.addElement("Hilo "+ i);
         //La lista de la ventana uno, se debe especificar bien, tipo como una ruta
              Ejemplo3.hilonumeros.setModel(modelo);
             try{
                 Thread.sleep(1500);
             }catch(InterruptedException exc){
                 System.out.println("interrupcion en el Hilo");
             }
             
         }System.out.println("Termina el subproceso- Hilo2");
}
    @Override
    public void run() {
         SubHilo2();
         
       
    }
    
    
    /* public static void main(String[] args) {
     DefaultListModel modelo3=new DefaultListModel();
       int i=1;
        modelo3.addElement("   main \n");
         for(i=1; i<6; i++){
             modelo3.addElement("Main "+ i);
         //La lista de la ventana uno, se debe especificar bien, tipo como una ruta
              Ejemplo3.listamain.setModel(modelo3);
             try{
                 Thread.sleep(500);
             }catch(InterruptedException exc){
                 System.out.println("interrupcion en el Hilo");
             }
         }
        System.out.println("Termina MAIN");
    }*/
    
}
