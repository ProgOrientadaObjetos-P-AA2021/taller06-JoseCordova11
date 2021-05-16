package paquete1;

/**
 *
 * @author Jose Cordova
 */
public class Ciudad {

    private String nCiudad, nProvincia;

    public Ciudad(String c, String p){
        nCiudad = c;
        nProvincia = p;
    }
    
    public void establecerCiudad(String nc){
        nCiudad = nc;
    }
    public void establecerProvincia(String np){
        nProvincia = np;
    }
    
    public String obtenerCiudad() {
        return nCiudad;
    }
    public String obtenerProvincia() {
        return nProvincia;
    }

}