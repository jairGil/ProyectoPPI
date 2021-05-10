/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.util.ArrayList;

/**
 *
 * @author Dell
 */
public class Sala {
    private int noSala;
    private int noAsientos;
    private int noFilas;
    private int noColumnas;
    private ArrayList<Asiento> registroAsientos = new ArrayList();
    private boolean lleno;
    private float costoBoleto;
    private Cartelera cartelera;
}
