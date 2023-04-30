public class Pelicula {
    private String titulo;
    private String genero;
    private String creador;
    private int anio;
    private int duracion;
    private boolean visto;

    // Constructor por defecto
    public Pelicula() {}

    // Constructor con titulo y creador
    public Pelicula(String titulo, String creador) {
        this.titulo = titulo;
        this.creador = creador;
        this.anio = 0;
        this.genero = "";
        this.duracion = 0;
        this.visto = false;
    }

    // Constructor con todos los atributos excepto visto
    public Pelicula(String titulo, String genero, String creador, int anio, int duracion) {
        this.titulo = titulo;
        this.genero = genero;
        this.creador = creador;
        this.anio = anio;
        this.duracion = duracion;
        this.visto = false;
    }

    // Métodos get de todos los atributos excepto visto
    public String getTitulo() {
        return titulo;
    }

    public String getGenero() {
        return genero;
    }

    public String getCreador() {
        return creador;
    }

    public int getAnio() {
        return anio;
    }

    public int getDuracion() {
        return duracion;
    }

    // Métodos set de todos los atributos excepto visto
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    // Sobrescribe el método toString
    @Override
    public String toString() {
        return "Pelicula{" +
                "titulo='" + titulo + '\'' +
                ", genero='" + genero + '\'' +
                ", creador='" + creador + '\'' +
                ", anio=" + anio +
                ", duracion=" + duracion +
                ", visto=" + visto +
                '}';
    }

    // Implementa la interfaz Visualizable
    public void marcarVisto() {
        visto = true;
    }

    public boolean esVisto() {
        return visto;
    }

    public int tiempoVisto() {
        int tiempo = 0;
        if (visto) {
            tiempo = duracion;
        }
        return tiempo;
    }
}
