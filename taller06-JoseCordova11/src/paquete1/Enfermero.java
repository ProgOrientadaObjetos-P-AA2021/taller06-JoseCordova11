package paquete1;

/**
 *
 * @author Jose Cordova
 */
public class Enfermero {
    private String nombreEnfermero;
    private String tipo;
    protected double sueldoMensual;

    public Enfermero(String ne, String tip, double sueldo) {
        nombreEnfermero = ne;
        tipo = tip;
        sueldoMensual = sueldo;
    }

    public void establecerNombre(String n) {
        nombreEnfermero = n;
    }

    public void establecerTipo(String t) {
        tipo = t;
    }

    public void establecerSueldoM(double s) {
        sueldoMensual = s;
    }

    public String obtenerNombre() {
        return nombreEnfermero;
    }

    public String obtenerTipo() {
        return tipo;
    }

    public double obtenerSueldoM() {
        return sueldoMensual;
    }
    
    @Override
    public String toString() {
        return String.format("- %s - sueldo: %s - %s\n",
                obtenerNombre(),
                obtenerSueldoM(),
                obtenerTipo());
    }
    
}
