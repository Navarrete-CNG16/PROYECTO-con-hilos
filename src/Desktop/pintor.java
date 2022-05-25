
package Desktop;
import java.util.Observable;
import java.util.logging.Level;
import java.util.logging.Logger;

public class pintor extends Observable implements Runnable{

    private String bote; //nombre que es para identificarlos botes de los colores
   // private int porcentaje; //porcentaje que a recorido la pintura
    
    public pintor(String bote){
        this.bote=bote;
    }
    
    public String getBote(){
        return bote;
    }
    
    @Override
    public void run() {
        int porcentaje=0 ;
        int numAleatorio;
 try {     
        while(porcentaje<100){
            numAleatorio= generarNA(1,15);
            System.out.println("Pintura1 "+ bote+ "ha caido "+ numAleatorio);
            porcentaje+=numAleatorio;
           //Hablamos a las notificaciones
        this.setChanged();
        this.notifyObservers(porcentaje);
        this.clearChanged();
    //Cuando uno gana interrumpo los demas      
            
                Thread.sleep(1000);
          } 
       }catch (InterruptedException ex) {
               System.out.println("hilo Interrumpido ");
            }
        
        
    }
    
    public static int generarNA(int minimo,int maximo){
        int num= (int) Math.floor(Math.random()*(maximo - minimo + 1)+ (minimo));
        return num;
    }
    
}
