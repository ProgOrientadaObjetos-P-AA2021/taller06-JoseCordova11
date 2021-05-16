package paquete1;

/**
 *
 * @author Jose Cordova
 */
public class Medico {
    private String nombreMedi;
    private String especialidad;
    private double sueldoMensual;

    public Medico(String nom, String espe, double suel) {
        nombreMedi = nom;
        especialidad = espe;
        sueldoMensual = suel;
    }
  
    public void establecerNombre(String n) {
        nombreMedi = n;
    }
    public void establecerEspecialidad(String e) {
        especialidad = e;
    }
    public void establecerSueldoM(double sm) {
        sueldoMensual = sm;
    }

    public String obtenerNombre() {
        return nombreMedi;
    }
    public String obtenerEspecialidad() {
        return especialidad;
    }
    public double obtenerSueldoM() {
        return sueldoMensual;
    }
    
    @Override
    public String toString() {
        return String.format("- %s - sueldo: %s - %s\n",
                obtenerNombre(),
                obtenerEspecialidad(),
                obtenerSueldoM());
    }
    
}
