package controlador;

import vista.FrmPrincipal;
import vista.PnSala;
import vista.PnSucursal;
import vista.PnlGerente;

public class CtrlInicio {
    private javax.swing.JFrame frm;
    private FrmPrincipal frmPrincipal;

    public CtrlInicio() {
    }
    
    public void setFrame (javax.swing.JFrame frm) {
        this.frm = frm;
    }
    
    public void intercambiaVista (javax.swing.JFrame frm) {
        if (this.frm.isVisible()) {
            this.frm.setVisible(false);
            frm.setVisible(true);
        } else {
            frm.setVisible(false);
            this.frm.setVisible(true);
        }
    }
    
    public void intercambiaPanel (javax.swing.JPanel pnl) {
        this.frmPrincipal.PnlDerecho.removeAll();
        this.frmPrincipal.PnlDerecho.add(pnl);
        this.frmPrincipal.PnlDerecho.validate();
        this.frmPrincipal.PnlDerecho.repaint();
    }
    
    public void botonSeleccionado (FrmPrincipal frm, javax.swing.JToggleButton btn) {
        frmPrincipal = frm;
        desactivaBotones();
        
        if (btn.equals(this.frmPrincipal.btnGerente)) {
            this.frmPrincipal.btnGerente.setSelected(true);
            intercambiaPanel(new PnlGerente());
        } else if (btn.equals(this.frmPrincipal.btnSala)) {
            this.frmPrincipal.btnSala.setSelected(true);
            intercambiaPanel(new PnSala());
        } else if (btn.equals(this.frmPrincipal.btnSucursal)) {
            this.frmPrincipal.btnSucursal.setSelected(true);
            intercambiaPanel(new PnSucursal());
        }
    }
    
    public void desactivaBotones () {
        this.frmPrincipal.btnGerente.setSelected(false);
        this.frmPrincipal.btnSala.setSelected(false);
        this.frmPrincipal.btnSucursal.setSelected(false);
    }
}
