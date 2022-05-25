
package Desktop;

/**
 *
 * @author CLAUDIA NAVARRETE
 */
public class HiloRunE4  implements Runnable {
    public Thread Hilo;
    String N_hilo;
    static Hilo4 obj = new Hilo4();//Objeto sincronizado
    static Hilo4 obj2 = new Hilo4();//Objeto sincronizado
   
HiloRunE4(String nombrehilo){//Costructor
        Hilo = new Thread(this, nombrehilo);
        N_hilo = nombrehilo;
        System.out.println("Comienza el Ciclo: "+ Hilo.getName());
        Hilo.start();
    }

    @Override
    public void run() {
synchronized(obj){
    try{
            if(N_hilo=="Ciclo1Numero"){
                Thread.sleep(1000);
                obj.Ciclo1N();
                System.out.println("Prioridad: "+Hilo.getPriority());
                
            }
                 if(N_hilo=="Ciclo1Numero"){    //Este ya no va porque va a tomar el otro que ya estaba
                   Thread.sleep(5000);
                   obj.Ciclo2N();
                   System.out.println("Prioridad: "+Hilo.getPriority());
                   
                   }
          /*  if(N_hilo=="Ciclo1Letras"){
                Thread.sleep(2500);
                System.out.println("Prioridad: "+Hilo.getPriority());
                obj.Ciclo1L();
            }
                 if(N_hilo=="Ciclo2Letras"){
                    Thread.sleep(7500);
                    System.out.println("Prioridad: "+Hilo.getPriority());
                    obj.Ciclo1L();
                */
   }catch(InterruptedException exc){
            System.out.println("Interrupcion de hilo "+Hilo.getName());
            }
}
    synchronized(obj2){
         try{
        /*    if(N_hilo=="Ciclo1Numero"){
                Thread.sleep(1000);
                System.out.println("Prioridad: "+Hilo.getPriority());
                obj.Ciclo1N();
            }
                 if(N_hilo=="Ciclo1Numero"){    //Este ya no va porque va a tomar el otro que ya estaba
                   Thread.sleep(5000);
                   System.out.println("Prioridad: "+Hilo.getPriority());
                   obj.Ciclo1N();
                   }*/
            if(N_hilo=="Ciclo1Letras"){
                Thread.sleep(2500);
                obj.Ciclo1L();
                System.out.println("Prioridad: "+Hilo.getPriority());
                
            }
                 if(N_hilo=="Ciclo1Letras"){
                    Thread.sleep(7500);
                    obj.Ciclo2L();
                    System.out.println("Prioridad: "+Hilo.getPriority());
                   
                }
            }catch(InterruptedException exc){
            System.out.println("Interrupcion de hilo "+Hilo.getName());
            }
    }
   
    }
}
