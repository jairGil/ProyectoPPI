import controlador.CtrlInicio;
import javax.swing.JFrame;
import vista.FrmLogin;

public class App {
    
    public static void main(String[] args) {
        CtrlInicio control = new CtrlInicio();
        FrmLogin app = new FrmLogin(control);
        control.setFrame(app);
        app.setVisible(true);
    }
}
