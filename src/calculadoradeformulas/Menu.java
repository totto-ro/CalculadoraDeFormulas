package calculadoradeformulas;

import java.io.PrintStream;
import java.util.Scanner;

public class Menu {

    static PrintStream out = System.out;
    private final Scanner scanner;

    public Menu() {
        this.scanner = new Scanner(System.in);
    }

    public void mostrarMenu() {

        int opcion;

        do {
            out.println("*** ¡Bienvenido a la Calculadora de Formas! ***");
            out.println("Menú:");
            out.println("1) Calcular área");
            out.println("2) Calcular perímetro");
            out.println("3) Estadística");
            out.println("4) Conjeturas");
            out.println("5) Salir");
            out.print("\nSeleccione una opción: \n");

            if (scanner.hasNextInt()) {
                opcion = scanner.nextInt();
                scanner.nextLine();

                switch (opcion) {
                    case 1:
                        break;
                    case 2:
                        MenuPerimetros menuPerimetros = new MenuPerimetros(scanner, out);
                        menuPerimetros.mostrarMenuPerimetros();
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 5:
                        out.println("Saliendo...");
                        break;
                    default:
                        out.println("¡Opción inválida! ¡Intenta de nuevo!\n");
                }
            } else {
                out.println("\n¡Por favor, ingrese un número entero correspondiente a una opción del menú!\n");
                scanner.nextLine();
                opcion = 0;
            }
        } while (opcion != 5);

    }
}
