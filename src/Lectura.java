import java.util.Scanner;

public class Lectura {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el nombre de tu pelicula favorita ");
        String pelicula = teclado.nextLine();
        System.out.println("Ingrese la fecha de lanzamiento ");
        int fechaDeLanzamiento = teclado.nextInt();
        System.out.println("Ingrese la nota que le das a la pelicula ");
        double nota= teclado.nextDouble();

        System.out.println(pelicula);
        System.out.println(fechaDeLanzamiento);
        System.out.println(nota);
    }
}
