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
public class Candidato {
    private String nombre;
    private String apellido;
    private int cedula; 
    private int edad;
    private String direccion;
    private int telefono;
    private String ciudadNa;
    private String partido;
    double valorCampaña; 
    private double publicidad;
    
    
    Candidato(String nombre, String apellido, int cedula,  int edad, int telefono, String direccion,   String ciudadNa, String partido ){
        
        this.nombre=nombre;
        this.apellido=apellido;
        this.cedula=cedula;
        this.edad=edad;
        this.telefono=telefono;
        this.direccion=direccion;
        this.ciudadNa=ciudadNa;
        this.partido=partido;

    }
    public void setNombre(String _nombre){
        this.nombre=_nombre;
    }
    public String getNombre(){
        return this.nombre;
    }
    
    public void setApellido(String _apellido){
        this.apellido=_apellido;
    }
    public String getApellido(){
     return this.apellido;
    }
    
    public void setCedula(int _cedula){
        this.cedula=_cedula;
    }
    public int getCedula(){
     return this.cedula;
    }
    
    public void setEdad(int _edad ){
        this.edad=_edad;
    }
    public int getEdad(){
     return this.edad;
    }
    
    public void setTelefono(int _telefono ){
        this.telefono=_telefono;
    }
    public int getTelefono(){
     return this.telefono;
    }
    
    public void setDireccion(String _direccion ){
        this.direccion=_direccion;
    }
    public String getDireccion(){
     return this.direccion;
    }
    
    public void setCiudadNa(String _ciudadNa ){
        this.ciudadNa=_ciudadNa;
    }
    public String getCiudadNa(){
     return this.ciudadNa;
    }
    
    public void setPartido(String _partido ){
        this.partido=_partido;
    }
    public String getPartido(){
     return this.partido;
    }
    protected String partido1(){
        String respue="Partido "+this.partido+" ";
        return respue;
    }
    protected String datoPartido(){
        String respuesta="Nombre:"+this.nombre+" "+this.apellido;
        respuesta+="\nNumero de Documento "+this.cedula;
        respuesta+="\nCiudad: "+this.ciudadNa;
        respuesta+="\nEdad: "+this.edad;
        respuesta+="\nTelefono: "+this.telefono;
        respuesta+="\nDirección: "+this.direccion;
        respuesta+="\nPartido "+this.partido+"\n\n ";
        
        return respuesta;
    }
}
