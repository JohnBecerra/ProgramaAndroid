public class Serie extends Visualizable {
    private String titulo;
    private int numTemporadas;
    private boolean visto;
    private String genero;
    private String creador;
    private int duracion;

    // Constructor default
    public Serie() {
        this.titulo = "";
        this.numTemporadas = 1;
        this.visto = false;
        this.genero = "";
        this.creador = "";
        this.duracion = 0;
    }

    // Constructor con titulo y creador
    public Serie(String titulo, String creador) {
        this.titulo = titulo;
        this.numTemporadas = 1;
        this.visto = false;
        this.genero = "";
        this.creador = creador;
        this.duracion = 0;
    }

    // Constructor con todos los atributos excepto visto
    public Serie(String titulo, int numTemporadas, String genero, String creador, int duracion) {
        this.titulo = titulo;
        this.numTemporadas = numTemporadas;
        this.visto = false;
        this.genero = genero;
        this.creador = creador;
        this.duracion = duracion;
    }

    // Métodos get de todos los atributos excepto visto
    public String getTitulo() {
        return titulo;
    }

    public int getNumTemporadas() {
        return numTemporadas;
    }

    public String getGenero() {
        return genero;
    }

    public String getCreador() {
        return creador;
    }

    public int getDuracion() {
        return duracion;
    }

    // Métodos set de todos los atributos excepto visto
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setNumTemporadas(int numTemporadas) {
        this.numTemporadas = numTemporadas;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    // Implementación de los métodos de la interfaz Visualizable
    @Override
    public void marcarVisto() {
        this.visto = true;
    }

    @Override
    public boolean esVisto() {
        return this.visto;
    }

    @Override
    public int tiempoVisto(int tiempo) {
        if (this.visto) {
            return tiempo;
        } else {
            return 0;
        }
    }

    // Sobrescritura del método toString
    @Override
    public String toString() {
        return "Serie{" +
                "titulo='" + titulo + '\'' +
                ", numTemporadas=" + numTemporadas +
                ", visto=" + visto +
                ", genero='" + genero + '\'' +
                ", creador='" + creador + '\'' +
                ", duracion=" + duracion +
                '}';
    }
}
