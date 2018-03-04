/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package votaciones;

/**
 *
 * @author Sales Rep01
 */
public class partido extends Candidato {
    private String nombre;

    public partido(String nombre, String apellido, int cedula, int edad, int telefono, String direccion, String ciudadNa, String partido) {
        super(nombre, apellido, cedula, edad, telefono, direccion, ciudadNa, partido);
    }
    public void sumarCampaña(int valor){
        this.valorCampaña+=valor;
    }
}
