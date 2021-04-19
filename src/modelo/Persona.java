/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author jair
 */
public class Persona {

    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    
    public Persona(String nombre, String apellidoPaterno, String apellidoMaterno) {
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) throws ExcepcionesString {
        if (nombre.equals("") || nombre.isEmpty())
            throw new ExcepcionesString("Nombre no válido");
        this.nombre = nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) throws ExcepcionesString {
        if (apellidoPaterno.equals("") || apellidoPaterno.isEmpty())
            throw new ExcepcionesString("Apellido Paterno no válido");
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) throws ExcepcionesString {
        if (apellidoMaterno.equals("") || apellidoMaterno.isEmpty())
            throw new ExcepcionesString("Apellido Materno no válido");
        this.apellidoMaterno = apellidoMaterno;
    }
    
}
