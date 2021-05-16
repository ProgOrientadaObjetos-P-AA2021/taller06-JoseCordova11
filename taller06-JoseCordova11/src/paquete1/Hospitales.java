package paquete1;

import java.util.ArrayList;

/**
 *
 * @author Jose Cordova
 */
public class Hospitales {
    
    private String nombreHospital;
    private String direccionHospital;
    private Ciudad ciudadH;
    private int especialidad;
    private double totalSueldos;
    private ArrayList<Medico> medicos = new ArrayList<>();
    private ArrayList<Enfermero> enfermeros = new ArrayList<>();

    public Hospitales(String nh, String dh, int esp, Ciudad c) {
        nombreHospital = nh;
        direccionHospital = dh;
        ciudadH = c;
        especialidad = esp;
    }

    public void estabelcerNombreHospital(String n) {
        nombreHospital = n;
    }

    public void establecerDireccionHospital(String d) {
        direccionHospital = d;
    }

    public void establecerEspecialidades(int e) {
        especialidad = e;
    }

    public void estabecerCiudadH(Ciudad c) {
        ciudadH = c;
    }

    public void estableceTotalSueldos(double totSu) {
        for (Medico i : medicos) {
            totalSueldos += i.obtenerSueldoM();
        }
        for (Enfermero i : enfermeros) {
            totalSueldos += i.obtenerSueldoM();
        }
    }
     public void estabelcerMedicos(ArrayList<Medico> med) {
        medicos = med;
    }

    public void establecerEnfermeros(ArrayList<Enfermero> enf) {
        enfermeros = enf;
    }

    public void agregarMedico(Medico med) {
        medicos.add(med);
    }

    public void agregarEnfermero(Enfermero enf) {
        enfermeros.add(enf);
    }

    public String obtenerNombreHospital() {
        return nombreHospital;
    }

    public String obtenerDireccionHospital() {
        return direccionHospital;
    }

    public int obtenerEspecialidades() {
        return especialidad;
    }

    public Ciudad obtenerCiudadH() {
        return ciudadH;
    }

    public double obtenerTotalSueldo() {
        return totalSueldos;
    }

    public ArrayList<Medico> obtenerMedicos() {
        return medicos;
    }

    public ArrayList<Enfermero> obtenerEnfermeros() {
        return enfermeros;
    }

    public String obtenerInfoMedicos() {
        String inf = "";
        for (Medico i : medicos) {
            inf += i.toString();
        }
        return inf;
    }

    public String obtenerInfoEnfermeros() {
        String inf = "";
        for (Enfermero i : enfermeros) {
            inf += i.toString();
        }
        return inf;
    }
    
    
    public String toString() {
        return String.format("Hospital %s\nDireccion: %s\nCiudad: "
                + "%s\nProvincia: %s\nNumero especialidades: %s\nListado de "
                + "médicos: \n%s\nListado de enferemeros(as): \n%s\n\n"
                + "Total de sueldos a pagar por mes: %s \n",
                obtenerNombreHospital(),
                obtenerDireccionHospital(),
                ciudadH.obtenerCiudad(),
                ciudadH.obtenerProvincia(),
                especialidad,
                obtenerInfoMedicos(),
                obtenerInfoEnfermeros(),
                obtenerTotalSueldo());
    }
    
}
