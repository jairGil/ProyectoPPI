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
public class Gerente extends Empleado{

    public Gerente(String noTelefono, String correoElectronico, String direccion, 
            float salario, String nombre, String apellidoPaterno, String apellidoMaterno) {
        super(noTelefono, correoElectronico, direccion, salario, nombre, apellidoPaterno, apellidoMaterno);
    }

    public Gerente(String noTelefono, float salario, String nombre, 
            String apellidoPaterno, String apellidoMaterno) {
        super(noTelefono, salario, nombre, apellidoPaterno, apellidoMaterno);
    }

    public Gerente(String noTelefono, String correoElectronico, float salario, 
            String nombre, String apellidoPaterno, String apellidoMaterno) {
        super(noTelefono, correoElectronico, salario, nombre, apellidoPaterno, apellidoMaterno);
    }

    public Gerente(float salario, String nombre, String apellidoPaterno, 
            String apellidoMaterno) {
        super(salario, nombre, apellidoPaterno, apellidoMaterno);
    }
    
}
