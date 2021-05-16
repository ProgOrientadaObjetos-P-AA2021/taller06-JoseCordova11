package paquete2;
import java.util.Scanner;
import paquete1.Ciudad;
import paquete1.Enfermero;
import paquete1.Hospitales;
import paquete1.Medico;

/**
 *
 * @author Jose Cordova 
 */
public class Principal {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
    
        System.out.println("Ingrese el nombre de la ciudad del Hospital");
        String ch = leer.nextLine();
        
        System.out.println("Ingrese la provincia del Hospital");
        String ph = leer.nextLine();
        
        System.out.println("Ingrese el nombre del Hospital");
        String nh = leer.nextLine();
        
        System.out.println("Ingrese la direccion del Hospital");
        String dh = leer.nextLine();
        
        System.out.println("Ingrese el numero de medicos");
        int nmed= leer.nextInt();
        
        System.out.println("Ingrese el numero de enfermeros");
        int nenf = leer.nextInt();
        
        System.out.println(" ");
        
        Ciudad c1 = new Ciudad(ch, ph);
        Hospitales h1 = new Hospitales(nh, dh, (nmed + nenf), c1);
        for (int i = 0; i < nmed; i++) {
            System.out.println("Ingrese el nombre del medico" + i);
            String nomM = leer.next();
            System.out.println("");
            System.out.println("Ingrese el tipo ");
            String tipo = leer.next();
            System.out.println(" ");
            System.out.println("Ingrese el sueldo del medico " + i);
            double suelmedi = leer.nextInt();
            Medico med = new Medico(nomM, tipo, suelmedi);
            h1.agregarMedico(med);
        }
        for (int i = 0; i < nenf; i++) {
            System.out.println("Ingrese el nombre del enfermero " + i);
            String nef = leer.next();
            System.out.println(" ");
            System.out.println("Ingrese el tipo contrato o nombramiento ");
            String tief = leer.next();
            System.out.println(" ");
            System.out.println("Ingrese el sueldo del enfermero " + i);
            double suelenf = leer.nextInt();
            Enfermero enfe = new Enfermero(nef, tief, suelenf);
            h1.agregarEnfermero(enfe);
        }
        h1.estableceTotalSueldos(nenf);
        System.out.println(h1);
    }
}
