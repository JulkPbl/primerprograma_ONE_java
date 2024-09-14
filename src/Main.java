public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenida(a) a Screen Match");
        System.out.println("Pelicula: Matrix");

        int fechaDeLanzamiento = 1999;
        boolean incluidoEnElPlan =true;
        double notaDeLaPelicula = 8.2;

        double media = (8.2 + 6.0 + 9.0) / 3 ;

        System.out.println("Pelicula: " + fechaDeLanzamiento);
        System.out.println("Pelicula: " + notaDeLaPelicula);
        System.out.println("Pelicula: " + media);

        String sipnosis= """
                Matrix es una paradoja
                La mejor pelicula del fin del milenio
                Fue lanzada en:""" + " " +fechaDeLanzamiento;
        System.out.println("Pelicula: "  + sipnosis);

        int clasificacion = (int) (media/2);
        System.out.println("Pelicula: " + clasificacion);
    }

}