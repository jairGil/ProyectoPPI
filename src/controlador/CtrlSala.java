/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import controlador.crud.DaoSala;
import excepciones.ExAsiento;
import excepciones.ExSala;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import modelos.Sala;
import vista.PnSala;

/**
 *
 * @author temaz
 */
public class CtrlSala {
    
    private PnSala ps;
    private DaoSala daosala;
            
    public void setVista(PnSala ps) {
        this.ps = ps;
    }
    
    public void agregarSala(ActionEvent ae){
        Sala sala;
        if(this.ps.getNoSala().isEmpty() || this.ps.getNoAsientos().isEmpty() ||
                this.ps.getNoFilas().isEmpty() || this.ps.getNoCol().isEmpty() ||
                this.ps.getCostoBoleto().isEmpty()){
            JOptionPane.showMessageDialog(ps, "Llene los campos vacios.");
        }else{
            try{
                int ns = Integer.parseInt(this.ps.getNoSala());
                int na = Integer.parseInt(this.ps.getNoAsientos());
                int nf = Integer.parseInt(this.ps.getNoFilas());
                int nc = Integer.parseInt(this.ps.getNoCol());
                float cb = Float.parseFloat(this.ps.getCostoBoleto());
                if((nf*nc) == na){
                    sala = new Sala(ns, na, nf, nc, false, cb);
                    daosala.crear(sala);
                }else{
                    JOptionPane.showMessageDialog(ps, "El producto de filas por columnas no es \n igual al no. de asientos.");
                }

            }catch(ExAsiento | ExSala ex){
                JOptionPane.showMessageDialog(ps, "Error al agregar sala.");
            }
        }
    }
    
    public void mostrarSala(ActionEvent ae, JTable tSal, String[] columnas, int n){
        daosala.mostrar(tSal, columnas, n);
    }
    
    public void consultarSala(ActionEvent ae, JTable tSal, String[] columnas){
        ArrayList<Sala> salas = daosala.leer();
        if(this.ps.getNoSalaC().isEmpty()){
            JOptionPane.showMessageDialog(ps, "Ingrese en número de sala.");
        }else{
            try{
                int ns = Integer.parseInt(this.ps.getNoSalaC());
                daosala.consultar(tSal, columnas, 5, ns);
            }catch(Exception ex){
                JOptionPane.showMessageDialog(ps, "Error al mostrar sala.");
            }
        }
    }
    
    public void eliminarSala(ActionEvent ae){
        
        if(this.ps.getNoSalaB().isEmpty()){
            JOptionPane.showMessageDialog(ps, "Ingrese en número de sala.");
        }else{
            try{
                int ns = Integer.parseInt(this.ps.getNoSalaB());
                daosala.eliminar(ns);
                
            }catch(Exception ex){
                JOptionPane.showMessageDialog(ps, "Error al eliminar sala.");
            }
        }
    }
    
    public void modificarSala(ActionEvent ae){
        
        
    }
}
