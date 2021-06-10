/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import excepciones.ExAsiento;
import excepciones.ExSala;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Dell
 */
public class Sala implements Serializable{
    private int noSala;
    private int noAsientos;
    private int noFilas;
    private int noColumnas;
    private ArrayList<Asiento> registroAsientos = new ArrayList();
    private boolean lleno;
    private float costoBoleto;
    //private Cartelera cartelera;

    public Sala(int noSala, int noAsientos, int noFilas, int noColumnas, boolean lleno, float costoBoleto) throws ExAsiento, ExSala {
        setNoSala(noSala);
        setNoAsientos(noAsientos);
        setNoFilas(noFilas);
        setNoColumnas(noColumnas);
        this.lleno = lleno;
        setCostoBoleto(costoBoleto);
        crearAsientos(this.noFilas, this.noColumnas);
        
    }
    
    public Sala(int noSala, int noAsientos, int noFilas, int noColumnas, float costoBoleto) throws ExAsiento, ExSala {
        setNoSala(noSala);
        setNoAsientos(noAsientos);
        setNoFilas(noFilas);
        setNoColumnas(noColumnas);
        this.lleno = lleno;
        setCostoBoleto(costoBoleto);
        crearAsientos(this.noFilas, this.noColumnas);
        
    }
    
    public void crearAsientos(int filas, int columnas) throws ExAsiento{
        
        for(int i = 67; i <= (67 + filas); i++){
            for(int j = 1; j <= columnas; j++){
                registroAsientos.add(new Asiento((char)i,j,false));
            }
        }
        
    }

    public ArrayList<Asiento> cambiarAsientos(int filas, int columnas) throws ExAsiento{
        ArrayList<Asiento> nA = new ArrayList();
        for(int i = 67; i <= (67 + filas); i++){
            for(int j = 1; j <= columnas; j++){
                nA.add(new Asiento((char)i,j,false));
            }
        }
        
        return nA;
    }
    
    public void setAsientos(ArrayList<Asiento> as){
        this.registroAsientos = as;
    }
    
    public void setNoSala(int noSala) throws ExSala {
        if(noSala <= 0)
            throw new ExSala("Número de sala inválido");
        this.noSala = noSala;
    }

    public void setNoAsientos(int noAsientos) throws ExSala {
        if(noAsientos <= 0)
            throw new ExSala("Número de asientos inválido");
        this.noAsientos = noAsientos;
    }

    public void setNoFilas(int noFilas) throws ExSala {
        if(noFilas <= 0)
            throw new ExSala("Número de filas inválido");
        this.noFilas = noFilas;
    }

    public void setNoColumnas(int noColumnas) throws ExSala {
        if(noColumnas <= 0)
            throw new ExSala("Número de columnas inválido");
        this.noColumnas = noColumnas;
    }

    public void setCostoBoleto(float costoBoleto) throws ExSala {
        if(costoBoleto <= 0)
            throw new ExSala("Costo de boleto inválido");
        this.costoBoleto = costoBoleto;
    }

    public int getNoSala() {
        return noSala;
    }

    public int getNoAsientos() {
        return noAsientos;
    }

    public int getNoFilas() {
        return noFilas;
    }

    public int getNoColumnas() {
        return noColumnas;
    }

    public ArrayList<Asiento> getRegistroAsientos() {
        return registroAsientos;
    }

    public boolean isLleno() {
        return lleno;
    }

    public float getCostoBoleto() {
        return costoBoleto;
    }
    
    
    
    
}
