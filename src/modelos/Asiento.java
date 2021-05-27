package modelos;

import excepciones.ExAsiento;
import java.io.Serializable;

public class Asiento implements Serializable{
    
    private char fila;
    private int columna;
    private boolean ocupado;

    public Asiento(char fila, int columna, boolean ocupado) throws ExAsiento {
        setFila(fila);
        setColumna(columna);
        this.ocupado = ocupado;
    }
    
    public void ocuparAsiento(){
        this.ocupado = true;
    }

    public void setFila(char fila) throws ExAsiento {
        if(fila < 65 || fila > 90)
            throw new ExAsiento("Valor de columnas inválido");
        if(fila < 97 || fila > 122)
            throw new ExAsiento("Valor de columnas inválido");
        this.fila = fila;
    }

    public void setColumna(int columna) throws ExAsiento {
        if(columna <= 0)
            throw new ExAsiento("Número de columnas inválido");
        this.columna = columna;
    }

    public char getFila() {
        return fila;
    }

    public int getColumna() {
        return columna;
    }

    public boolean isOcupado() {
        return ocupado;
    }
    
    
    
}
