package modelos;

public class Pelicula {
    private String titulo;
    private String director;
    private Horario duracion;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Horario getDuracion() {
        return duracion;
    }

    public void setDuracion(Horario duracion) {
        this.duracion = duracion;
    }

}
