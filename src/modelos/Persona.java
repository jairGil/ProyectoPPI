package models;

import excepciones.ExPersona;

public class Persona {

    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    
    public Persona(String nombre, String apellidoPaterno, String apellidoMaterno) throws ExPersona {
        setNombre(nombre);
        setApellidoPaterno(apellidoPaterno);
        setApellidoMaterno(apellidoMaterno);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) throws ExPersona {
        if (nombre.equals("") || nombre.isEmpty())
            throw new ExPersona("Nombre no válido");
        this.nombre = nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) throws ExPersona {
        if (apellidoPaterno.equals("") || apellidoPaterno.isEmpty())
            throw new ExPersona("Apellido Paterno no válido");
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) throws ExPersona {
        if (apellidoMaterno.equals("") || apellidoMaterno.isEmpty())
            throw new ExPersona("Apellido Materno no válido");
        this.apellidoMaterno = apellidoMaterno;
    }
    
}
