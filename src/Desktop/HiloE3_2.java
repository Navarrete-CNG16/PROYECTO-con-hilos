
package Desktop;
import javax.swing.DefaultListModel;

/**
 *
 * @author CLAUDIA NAVARRETE
 */
public class HiloE3_2 implements Runnable {
    DefaultListModel modelo=new DefaultListModel();
    public Thread hilo;
     String n_hilo;
     

private void SubHilo3() {
    modelo.addElement("   SubHilo3 \n");
     for(char c='a';c<'k';c++){
       //    System.out.println("Subproceso Hilo 3");
             modelo.addElement("Hilo "+ c);
         //La lista de la ventana uno, se debe especificar bien, tipo como una ruta
              Ejemplo3.listaCaracter.setModel(modelo);
             try{
                 Thread.sleep(500);
             }catch(InterruptedException exc){
                 System.out.println("interrupcion en el Hilo");
             }
             
         }System.out.println("Termina el subproceso - Hilo3");
}


    @Override
    public void run() {
         SubHilo3();
       
    }
    
    
}

