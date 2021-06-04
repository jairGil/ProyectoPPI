/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import controlador.crud.DaoGen;
import excepciones.ExSucursal;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import modelos.Sucursal;
import vista.PnSucursal;

/**
 *
 * @author Dell
 */
public class CtrlSucursal {
    private PnSucursal scrsl;
    private DaoGen<Sucursal> dscrsl;
    
    public void setVista(PnSucursal scrsl){
        this.scrsl=scrsl;
    }
    
    public void agregarSucursal(ActionEvent ae){
        Sucursal suc;
        if(this.scrsl.getNoSucursal((short)3).isEmpty() || this.scrsl.getUbicacion((short)3).isEmpty()){
            JOptionPane.showMessageDialog(scrsl, "Llene los campos vacios.");
        }else{
            try{
                int ns = Integer.parseInt(this.scrsl.getNoSucursal((short)3));
                String nu = (this.scrsl.getUbicacion((short)3));
                suc = new Sucursal(ns, nu);
                dscrsl.crearT(suc,"Sucs.dat");
            }catch(ExSucursal ex){
                JOptionPane.showMessageDialog(scrsl, "Error al agregar sala.");
            }
        }
    }
}
