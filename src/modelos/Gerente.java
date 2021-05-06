package models;

import excepciones.ExEmpleado;
import excepciones.ExPersona;

public class Gerente extends Empleado{

    public Gerente(String noTelefono, float salario, String nombre, 
            String apellidoPaterno, String apellidoMaterno) throws ExPersona, ExEmpleado {
        super(noTelefono, salario, nombre, apellidoPaterno, apellidoMaterno);
    }
    
    public Gerente (Empleado e) throws ExPersona, ExEmpleado {
        super(e.getNoTelefono(), e.getSalario(), e.getNombre(), e.getApellidoPaterno(), e.getApellidoMaterno());
    }
}
