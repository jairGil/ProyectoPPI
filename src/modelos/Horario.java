package modelos;

import excepciones.ExHorario;

public class Horario {
    private int horas;
    private int minutos;

    public Horario(int horas, int minutos) throws ExHorario {
        setHoras(horas);
        setMinutos(minutos);
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) throws ExHorario {
        if (horas < 0)
            throw new ExHorario("No existen horas negativas");
        if (horas > 23)
            throw new ExHorario("Excede el máximo de horas existentes");
        this.horas = horas;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) throws ExHorario {
        if (minutos < 0)
            throw new ExHorario("No existen minutos negativos");
        if (minutos > 59)
            throw new ExHorario("Excede el máximo de minutos");
        this.minutos = minutos;
    }
    
    
}
