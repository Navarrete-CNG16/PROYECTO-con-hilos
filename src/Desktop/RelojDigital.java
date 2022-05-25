
package Desktop;

import java.util.Observable;
//El observable es para indicar aquellos observadores
//algo que a cambiado
/**
 *
 * @author CLAUDIA NAVARRETE
 */
public class RelojDigital extends Observable implements Runnable{

    private int horas,minutos,segundos;
    
    //Constructor
    public RelojDigital(int horas,int minutos,int segundos){
        this.horas=horas;
        this.minutos=minutos;
        this.segundos= segundos;
    }
    
    
    @Override
    public void run() {
        String tiempo="";
        
     try{
         
        while(true){
            tiempo="";
            if(horas<10){
                tiempo+="0"+horas+":";
            }else{
                tiempo+=horas+":";
            }
            if(minutos<10){
                tiempo+="0"+minutos+":";
            }else{
                tiempo+=minutos+":";
            }
            if(segundos<10){
                tiempo+="0"+segundos;
            }else{
                tiempo+=segundos;
            }
            
   //notificar el tiempo, esto es por los observables         
        this.setChanged();
        this.notifyObservers(tiempo);
        this.clearChanged();
        
        Thread.sleep(1000);
        
            segundos ++;
            
            if(segundos==60){
            minutos++;
            segundos=0;
                  if(minutos==60){
                   horas++;
                   minutos=0;
                        if(horas==24){
                         horas=0;
                        } 
                   }
             }
        }
    }catch(InterruptedException exc){   // try  
       
    }
    } 
}