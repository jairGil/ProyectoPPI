package modelos;

import excepciones.ExEmpleado;
import excepciones.ExPersona;
import java.util.ArrayList;

public class Cajero extends Empleado {

    public Cajero(String noTelefono, float salario, String nombre, 
            String apellidoPaterno, String apellidoMaterno) 
            throws ExPersona, ExEmpleado {
        super(noTelefono, salario, nombre, apellidoPaterno, apellidoMaterno);
    }

    public Cajero(Empleado e) throws ExPersona, ExEmpleado {
        super(e.getNoTelefono(), e.getSalario(), e.getNombre(), e.getApellidoPaterno(), e.getApellidoMaterno());
    }
            
    
    ArrayList<Boleto> boleto= new ArrayList<Boleto>();
}
