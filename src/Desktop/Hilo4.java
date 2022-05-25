
package Desktop;
import javax.swing.DefaultListModel;
/**
 *
 * @author CLAUDIA NAVARRETE
 */
public class Hilo4 {
    
  DefaultListModel modelo = new DefaultListModel();
  DefaultListModel modelo2 = new DefaultListModel();
  DefaultListModel modelo3 = new DefaultListModel();
  DefaultListModel modelo4 = new DefaultListModel();
  
   
    synchronized void Ciclo1N(){
        modelo.addElement("Ciclo 1 Numeros");
        for(int i=1; i<6; i++)
        modelo.addElement("Hilo: "+i);
        modelo.addElement("Termino Numeros 1");
        Ejemplo4.ciclo1Num.setModel(modelo);
    }
     synchronized void Ciclo1L(){
        modelo3.addElement("Ciclo 1 Letras");
        for(char i='a'; i<'f'; i++)
        modelo3.addElement("Hilo: "+i);
        modelo3.addElement("Termino Letras 1");
        Ejemplo4.ciclo1Let.setModel(modelo3);
    }
  synchronized void Ciclo2N(){     
        modelo2.addElement("Ciclo 2 Numeros");
        for(int i=1; i<6; i++)
        modelo2.addElement("Hilo: "+i);
        modelo2.addElement("Termino Numeros 2");
        Ejemplo4.ciclo2Num.setModel(modelo2);
    }
   
  synchronized void Ciclo2L(){
        modelo4.addElement("Ciclo 2 Letras");
        for(char i='a'; i<'f'; i++)
        modelo4.addElement("Hilo: "+i);
        modelo4.addElement("Termino Letras 2");
        Ejemplo4.ciclo2Let.setModel(modelo4);
    }
    
}
