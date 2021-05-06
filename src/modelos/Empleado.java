package modelos;

import excepciones.ExEmpleado;
import excepciones.ExPersona;

public class Empleado extends Persona {

    private String noTelefono;
    private float salario;

    public Empleado(String noTelefono, float salario, String nombre, 
                    String apellidoPaterno, String apellidoMaterno) 
            throws ExPersona, ExEmpleado {
        super(nombre, apellidoPaterno, apellidoMaterno);
        this.noTelefono = noTelefono;
        this.salario = salario;
    }

    public Empleado(String noTelefono, String nombre, 
                    String apellidoPaterno, String apellidoMaterno) 
            throws ExPersona, ExEmpleado {
        this(noTelefono, 0, nombre, apellidoPaterno, apellidoMaterno);
    }
    
    public Empleado (Persona p, String noTelefono, float salario) throws ExPersona, ExEmpleado {
        this(noTelefono, salario, p.getNombre(), p.getApellidoPaterno(), p.getApellidoMaterno());
    }
    
    public Empleado (Persona p, String noTelefono) throws ExPersona, ExEmpleado {
        this(noTelefono, 0, p.getNombre(), p.getApellidoPaterno(), p.getApellidoMaterno());
    }
    
    public String getNoTelefono() {
        return noTelefono;
    }

    public void setNoTelefono(String noTelefono) throws ExEmpleado {
        if (noTelefono.length() != 10) 
            throw new ExEmpleado("Longitud del telefono no válida");
        if (!noTelefono.matches("\\d{10}"))
            throw new ExEmpleado("Numero no válido");
        this.noTelefono = noTelefono;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

}
