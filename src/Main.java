public class Main {
    public static void main(String[] args) {
        Pelicula p1 = new Pelicula("El Padrino", "Drama", "Francis Ford Coppola", 1972, 175);
        p1.marcarVisto();
        int tiempoVistoP1 = p1.tiempoVisto();

        Serie s1 = new Serie("Breaking Bad", "Drama", "Vince Gilligan", 5, 62);
        s1.marcarVisto();
        int tiempoVistoS1 = s1.tiempoVisto();

    }
}