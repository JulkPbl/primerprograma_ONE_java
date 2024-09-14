import java.util.Scanner;

public class CuentaBancaria {
    public static void main(String[] args) {
        String nombre = "Tony Stark";
        String tipoCuenta = "Ahorros";
        double saldo = 1500.01;

        int opcionMenu = 0;

        System.out.println("*****************************");
        System.out.println("\nNombre del Cliente: " + nombre);
        System.out.println("Tipo de Cuenta: " + tipoCuenta);
        System.out.println("Saldo disponible: " + "$" + saldo);
        System.out.println("\n*****************************");

        String menu = """
                *** Ingresar Opcion ***
                1. Consultar Saldo
                2. Retirar
                3. Depositar
                9. Salir
                """;
        Scanner teclado = new Scanner(System.in);
        while (opcionMenu != 9) {
            System.out.println(menu);
            System.out.println("Ingrese la opcion que desea consultar: ");
            opcionMenu = teclado.nextInt();

            switch (opcionMenu) {
                case 1:
                    System.out.println("El saldo actual es: $ " + saldo);
                    break;
                case 2:
                    System.out.println("Cual es el valor que desea retirar? ");
                    double valorRetirar = teclado.nextDouble();
                    if (saldo > valorRetirar) {
                        System.out.println("Saldo insuficiente");
                    }else {
                        saldo -= valorRetirar;
                        System.out.println("El saldo actualizado es: $ " + saldo);
                    }
                    break;
                case 3:
                    System.out.println("Cual es el valor que desea depositar?");
                    double valorDepositar = teclado.nextDouble();
                    saldo += valorDepositar;
                    System.out.println("El saldo actualizado es: $ " + saldo);
                    break;
                case 9:
                    System.out.println("Gracias por su preferencia");
                    break;
                default:
                    System.out.println("Opcion no valida\n");
                    break;
            }

        }



    }
}
