package controlador;

public class ControlInicio {
    private javax.swing.JFrame frm;

    public ControlInicio() {
    }
    
    public void setFrame (javax.swing.JFrame frm) {
        this.frm = frm;
    }
    
    public void intercambiaVista(javax.swing.JFrame frm) {
        if (this.frm.isVisible()) {
            this.frm.setVisible(false);
            frm.setVisible(true);
        } else {
            frm.setVisible(false);
            this.frm.setVisible(true);
        }
    }
    
}
