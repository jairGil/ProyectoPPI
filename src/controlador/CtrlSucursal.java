/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import controlador.crud.DaoGen;
import excepciones.ExEmpleado;
import excepciones.ExPersona;
import excepciones.ExSala;
import excepciones.ExSucursal;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelos.Cajero;
import modelos.Empleado;
import modelos.Gerente;
import modelos.Sala;
import modelos.Sucursal;
import vista.PnSucursal;

/**
 *
 * @author Dell
 */
public class CtrlSucursal {
    private PnSucursal scrsl;
    private DaoGen<Sucursal> dscrsl;
    ArrayList<Sucursal> tsuc = new ArrayList();
    private DefaultTableModel ts,tc,tg; //Tablas de salas, cajeros y gerentes, respectivamente
    String error;
    private int i,sa=-1,ns,nc,ng; //Número de salas, cajeros y gerentes, respectivamente
    private boolean sc=false,ec=false; //Banderas para activar el botón de registro de la sucursal
    private JButton btnreg; //Botón de guardado de la sucursal
    
    public void setVista(PnSucursal scrsl){
        this.scrsl=scrsl;
    }
    
    public void buscarSucursales(ActionEvent ae, short m){//1: Modificaciones, 2: Consultas, 4: Eliminaciones
        ts=this.scrsl.getSalas((short)m);
        tc=this.scrsl.getCajeros((short)m);
        tg=this.scrsl.getGerentes((short)m);
        tsuc= dscrsl.leerT("Sucs.dat"); //Lectura de las sucursales registradas
        if(tsuc.isEmpty()){
            JOptionPane.showMessageDialog(scrsl,"No hay sucursales registradas");
        }else{
            //Comprobación de los campos al presionar el botón
            try{
                if(this.scrsl.getNoSucursal((short)m).isEmpty() && !(this.scrsl.getUbicacion((short)m).isEmpty())){
                    for(i=0;i<tsuc.size();i++){
                        if(tsuc.get(i).getUbicacion().contentEquals(this.scrsl.getUbicacion((short)m))){
                            sa=i;
                        }
                    }
                }
                else if(this.scrsl.getUbicacion((short)m).isEmpty() && !(this.scrsl.getNoSucursal((short)m).isEmpty())){
                    for(i=0;i<tsuc.size();i++){
                        if(tsuc.get(i).getNoSucursal()==Integer.parseInt(this.scrsl.getNoSucursal((short)m))){
                            sa=i;
                        }
                    }
                }
                else if(!(this.scrsl.getUbicacion((short)m).isEmpty()) && !(this.scrsl.getNoSucursal((short)m).isEmpty())){
                    for(i=0;i<tsuc.size();i++){
                        if(tsuc.get(i).getNoSucursal()==Integer.parseInt(this.scrsl.getNoSucursal((short)m)) && tsuc.get(i).getUbicacion().contentEquals(this.scrsl.getNoSucursal((short)m))){
                            sa=i;
                        }
                    }
                    if(sa==-1){
                        error="No existe una sucursal con estos datos";
                        throw new ExSucursal();
                    }
                }
                else{
                    error="Ingrese los datos de la sucursal que desea modificar";
                    throw new ExSucursal();
                }

                for (int i = 0; i < tsuc.get(sa).getSalas().size(); i++) { //Salas de la sucursal consultada
                    if (ts.getRowCount() == 0) {
                        Object e[];
                        e = new Object[5];
                        e[0] = tsuc.get(sa).getSalas().get(i).getNoSala();
                        e[1] = tsuc.get(sa).getSalas().get(i).getNoAsientos();
                        e[2] = tsuc.get(sa).getSalas().get(i).getNoFilas();
                        e[3] = tsuc.get(sa).getSalas().get(i).getNoColumnas();
                        e[4] = tsuc.get(sa).getSalas().get(i).getCostoBoleto();
                        ts.addRow(e);
                    }
                }
                for (int i = 0; i < tsuc.get(sa).getEmpleados().size(); i++) { //Empleados de la sucursal consultada
                    if (tc.getRowCount() == 0 && tg.getRowCount()==0) {
                        Object e[];
                        e = new Object[5];
                        e[0] = tsuc.get(sa).getEmpleados().get(i).getNombre();
                        e[1] = tsuc.get(sa).getEmpleados().get(i).getApellidoPaterno();
                        e[2] = tsuc.get(sa).getEmpleados().get(i).getApellidoMaterno();
                        e[3] = tsuc.get(sa).getEmpleados().get(i).getNoTelefono();
                        e[4] = tsuc.get(sa).getEmpleados().get(i).getSalario();
                        if(tsuc.get(sa).getEmpleados().get(i) instanceof Cajero){
                            tc.addRow(e);
                        }else{
                            tg.addRow(e);
                        }

                    }
                }
                switch(m){
                case 1:
                    btnreg=this.scrsl.getBoton((short)1);
                    btnreg.setEnabled(true);
                    break;
                case 4:
                    btnreg=this.scrsl.getBoton((short)4);
                    btnreg.setEnabled(true);
                    break;
                }
            }catch(ExSucursal e){
                JOptionPane.showMessageDialog(scrsl,error);
            }
        }
    }
    
    public void agregarSalas(ActionEvent ae){ //Comenzar el llenado de los datos de las salas
        ts=this.scrsl.getSalas((short)3);
        btnreg=this.scrsl.getBoton((short)3);
        if(!(this.scrsl.getNumSalas().isEmpty())){
            ns = Integer.parseInt(this.scrsl.getNumSalas());
            ts.setRowCount(ns);
            sc=true;
            if(ec){
                btnreg.setEnabled(true);
            }
        }else{
            ts.setRowCount(0);
            JOptionPane.showMessageDialog(scrsl,"Ingrese el número de salas a registrar");
        }
    }
    
    public void agregarEmpleados(ActionEvent ae){ //Comenzar el llenado de los datos de los empleados
        tc=this.scrsl.getCajeros((short)3);
        tg=this.scrsl.getGerentes((short)3);
        btnreg=this.scrsl.getBoton((short)3);
        if(!(this.scrsl.getNumCajeros().isEmpty()) && !(this.scrsl.getNumGerentes().isEmpty())){
            nc = Integer.parseInt(this.scrsl.getNumCajeros());
            ng = Integer.parseInt(this.scrsl.getNumGerentes());
            tc.setRowCount(nc);
            tg.setRowCount(ng);
            ec=true;
            if(sc){
                btnreg.setEnabled(true);
            }
        }else{
            tc.setRowCount(0);
            tg.setRowCount(0);
            JOptionPane.showMessageDialog(scrsl,"Ingrese completamente el número de empleados a registrar");
        }
    }
    
    public void agregarSucursal(ActionEvent ae,short m){ //1: Modificaciones, 3: Registros
        ts=this.scrsl.getSalas((short)m);
        tc=this.scrsl.getCajeros((short)m);
        tg=this.scrsl.getGerentes((short)m);
        Sucursal suc;
        ns=ts.getRowCount();
        nc=tc.getRowCount();
        ng=tg.getRowCount(); 
        if(this.scrsl.getNoSucursal((short)m).isEmpty() || this.scrsl.getUbicacion((short)m).isEmpty() || tablaIncompleta(ts,ns,(short)0) || tablaIncompleta(tc,nc,(short)3) || tablaIncompleta(tg,ng,(short)3)){
            JOptionPane.showMessageDialog(scrsl, "Llene los campos vacios.");
        }else{
            error="Error al agregar la sucursal.";
            try{
                ArrayList<Sala> s = new ArrayList();
                ArrayList<Empleado> e = new ArrayList();
                Sala sal;
                Cajero caj;
                Gerente ger;
                int nums,numsal,numasi,numfil,numcol;
                float cosbol,salario;
                String numtel,nom,ap,am;
                tsuc = dscrsl.leerT("Sucs.dat");
                nums = Integer.parseInt(this.scrsl.getNoSucursal((short)m));
                String u = (this.scrsl.getUbicacion((short)m));
                for(i=0;i<tsuc.size();i++){
                    if(nums==tsuc.get(i).getNoSucursal()){
                        error="El número de sucursal ya está en uso";
                        throw new ExSucursal();
                    }else if(u.contentEquals(tsuc.get(i).getUbicacion())){
                        error="Ya existe una sucursal en esa ubicación";
                        throw new ExSucursal();
                    }
                }
                for(i=0;i<ns;i++){//Recuperación de datos de las salas
                    numsal=(int)ts.getValueAt(i,0);
                    numasi=(int)ts.getValueAt(i,1);
                    numfil=(int)ts.getValueAt(i,2);
                    numcol=(int)ts.getValueAt(i,3);
                    cosbol=(float)ts.getValueAt(i,4);
                    sal = new Sala(numsal,numasi,numfil,numcol,cosbol);
                    s.add(sal);
                }
                for(i=0;i<nc;i++){//Recuperación de datos de los cajeros
                    nom=(String)tc.getValueAt(i,0);
                    ap=(String)tc.getValueAt(i,1);
                    am=(String)tc.getValueAt(i,2);
                    numtel=(String)tc.getValueAt(i,3);
                    salario=(float)tc.getValueAt(i,4);
                    caj = new Cajero(numtel,salario,nom,ap,am);
                    e.add(caj);
                }
                for(i=0;i<ng;i++){//Recuperación de datos de los gerentes
                    nom=(String)tg.getValueAt(i,0);
                    ap=(String)tg.getValueAt(i,1);
                    am=(String)tg.getValueAt(i,2);
                    numtel=(String)tg.getValueAt(i,3);
                    salario=(float)tg.getValueAt(i,4);
                    ger = new Gerente(numtel,salario,nom,ap,am);
                    e.add(ger);
                }
                suc = new Sucursal(nums,u,s,e);
                tsuc.add(suc);
                dscrsl.actualizarT(tsuc,"Sucs.dat");
            }catch(ExSucursal | ExSala | ExPersona |ExEmpleado ex){
                JOptionPane.showMessageDialog(scrsl, error);
            }
        }
        switch(m){
                case 1:
                    btnreg=this.scrsl.getBoton((short)1);
                    btnreg.setEnabled(false);
                    break;
                case 4:
                    btnreg=this.scrsl.getBoton((short)3);
                    btnreg.setEnabled(false);
                    break;
            }
    }
    
    public void eliminarSucursal(ActionEvent ae){
        tsuc=dscrsl.leerT("Sucs.dat");
        try{
                if(this.scrsl.getNoSucursal((short)4).isEmpty() && !(this.scrsl.getUbicacion((short)4).isEmpty())){
                    for(i=0;i<tsuc.size();i++){
                        if(tsuc.get(i).getUbicacion().contentEquals(this.scrsl.getUbicacion((short)4))){
                            sa=i;
                        }
                    }
                }
                else if(this.scrsl.getUbicacion((short)4).isEmpty() && !(this.scrsl.getNoSucursal((short)4).isEmpty())){
                    for(i=0;i<tsuc.size();i++){
                        if(tsuc.get(i).getNoSucursal()==Integer.parseInt(this.scrsl.getNoSucursal((short)4))){
                            sa=i;
                        }
                    }
                }
                else if(!(this.scrsl.getUbicacion((short)4).isEmpty()) && !(this.scrsl.getNoSucursal((short)4).isEmpty())){
                    for(i=0;i<tsuc.size();i++){
                        if(tsuc.get(i).getNoSucursal()==Integer.parseInt(this.scrsl.getNoSucursal((short)4)) && tsuc.get(i).getUbicacion().contentEquals(this.scrsl.getNoSucursal((short)4))){
                            sa=i;
                        }
                    }
                    if(sa==-1){
                        error="No existe una sucursal con estos datos";
                        throw new ExSucursal();
                    }
                }
                else{
                    error="Ingrese los datos de la sucursal que desea eliminar";
                    throw new ExSucursal();
                }
                dscrsl.eliminarT(tsuc,tsuc.get(sa));
                dscrsl.actualizarT(tsuc, "Sucs.dat");
            }catch(ExSucursal e){
                JOptionPane.showMessageDialog(scrsl,error);
            }
    }
    
    static boolean tablaIncompleta(DefaultTableModel t, int n,short c){ //Revisa si a la tabla le falta algún registro en la columna indicada en c
        int i;
        for(i=0;i<n;i++){
            if(t.getValueAt(i, c)==null)
                return false;
        }
        return true;
    }
    
}
