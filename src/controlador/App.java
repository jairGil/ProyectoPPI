package controlador;

import vista.FrmLogin;

public class App {
    
    public static void main(String[] args) {
        ControlInicio control = new ControlInicio();
        FrmLogin app = new FrmLogin(control);
        control.setFrame(app);
        app.setVisible(true);
    }
}
