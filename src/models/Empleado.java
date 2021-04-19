/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author jair
 */
public class Empleado extends Persona {

    private String noTelefono;
    private String correoElectronico;
    private String direccion;
    private float salario;

    public Empleado(String noTelefono, String correoElectronico,
                    String direccion, float salario, String nombre, 
                    String apellidoPaterno, String apellidoMaterno) {
        super(nombre, apellidoPaterno, apellidoMaterno);
        this.noTelefono = noTelefono;
        this.correoElectronico = correoElectronico;
        this.direccion = direccion;
        this.salario = salario;
    }

    public Empleado(String noTelefono, float salario, String nombre, 
                    String apellidoPaterno, String apellidoMaterno) {
        this(noTelefono, null, null, salario, nombre, apellidoPaterno, apellidoMaterno);
    }
    
    public Empleado(String noTelefono, String correoElectronico, float salario, 
                    String nombre, String apellidoPaterno, String apellidoMaterno) {
        this(noTelefono, correoElectronico, null, salario, nombre, apellidoPaterno, apellidoMaterno);
    }
    
    public Empleado(float salario, String nombre, String apellidoPaterno, 
                    String apellidoMaterno) {
        this(null, null, null, salario, nombre, apellidoPaterno, apellidoMaterno);
    }

    public String getNoTelefono() {
        return noTelefono;
    }

    public void setNoTelefono(String noTelefono) {
        this.noTelefono = noTelefono;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

}
