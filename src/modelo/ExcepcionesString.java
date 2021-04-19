package modelo;

public class ExcepcionesString extends Exception {

    public ExcepcionesString() {
    }

    public ExcepcionesString(String string) {
        super(string);
    }

    public ExcepcionesString(String string, Throwable thrwbl) {
        super(string, thrwbl);
    }

    public ExcepcionesString(Throwable thrwbl) {
        super(thrwbl);
    }

    public ExcepcionesString(String string, Throwable thrwbl, boolean bln, boolean bln1) {
        super(string, thrwbl, bln, bln1);
    }
    
}
