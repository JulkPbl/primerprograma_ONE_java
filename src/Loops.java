import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double nota = 0;
        double mediaEvaluaciones = 0;
        int n = 3;

        for (int i = 0; i < n; i++) {
            System.out.println("Escribe la nota que le darias a la pelicula Matrix: ");
            nota = teclado.nextDouble();
            mediaEvaluaciones += nota;
        }

        System.out.println("La media de evaluaciones para Matrix es : "+ mediaEvaluaciones/n);
    }
}
