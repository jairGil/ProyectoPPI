package controlador;

public class ControlInicio {
    private final javax.swing.JFrame frm;

    public ControlInicio(javax.swing.JFrame frm) {
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
