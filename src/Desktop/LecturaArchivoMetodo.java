
package Desktop;
import java.io.BufferedReader;
import java.io.FileReader;
import javax.swing.JTextArea;
/**
 *
 * @author CLAUDIA NAVARRETE
 */
public class LecturaArchivoMetodo {
 // private JTextArea area;
  static String concatenado="";
  static String cadena="";
    
  
    
    
    void LeerArchivo(String Archivo) {
        try{   //para leer
            Thread.sleep(1000);
          try{  //para los archivos
              String cadena;
              FileReader obj1= new FileReader(Archivo);
              BufferedReader obj2 = new BufferedReader(obj1);
              cadena= obj2.readLine();
              obj2.close();
              concatenado+= cadena+"\n";
          }catch(Exception e){
              System.out.println("Excepcion "+ e);
          }
        }catch(InterruptedException e2){
             System.out.println("Excepcion "+ e2);
        }
    }
    
    synchronized void ImprimeArchivo(){
        
        Ejemplo3.jTextArea1.setText("El archivo leido, contiene : \n "+ concatenado);
    }
   
}
