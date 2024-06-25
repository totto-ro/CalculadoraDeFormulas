package calculadoradeformulas;

import java.io.PrintStream;
import java.util.Scanner;

public class MenuPerimetros {

    private Scanner scanner;
    private PrintStream out;

    public MenuPerimetros(Scanner scanner, PrintStream out) {
        this.scanner = scanner;
        this.out = out;
    }

    public void mostrarMenuPerimetros() {
        int tipoFigura;

        out.println("Seleccione la figura para calcular el perímetro:");
        out.println("1) Círculo");
        out.println("2) Triángulo");
        out.println("3) Cuadrado");
        out.println("4) Rectángulo");
        out.println("5) Rombo");
        out.println("6) Romboide");
        out.println("7) Trapecio");
        out.println("8) Polígono Regular");
        out.println("9) Salir");

        if (scanner.hasNextInt()) {
            tipoFigura = scanner.nextInt();
            scanner.nextLine();

            Figura2D figuraGeometrica = null;

            switch (tipoFigura) {
                case 1:
                    out.print("Ingrese el radio del círculo: ");
                    double radio = scanner.nextDouble();
                    figuraGeometrica = new Circulo(radio, "Circulo");
                    break;
                case 2:
                    out.print("Ingrese el primer lado del triángulo: ");
                    double lado1 = scanner.nextDouble();
                    out.print("Ingrese el segundo lado del triángulo: ");
                    double lado2 = scanner.nextDouble();
                    out.print("Ingrese el tercer lado del triángulo: ");
                    double lado3 = scanner.nextDouble();
                    figuraGeometrica = new Triangulo(lado1, lado2, lado3, "Triangulo");
                    break;
                case 3:
                    out.print("Ingrese el lado del cuadrado: ");
                    double lado = scanner.nextDouble();
                    figuraGeometrica = new Cuadrado(lado, "Cuadrado");
                    break;
                case 4:
                    out.print("Ingrese el largo del rectángulo: ");
                    double largo = scanner.nextDouble();
                    out.print("Ingrese el ancho del rectángulo: ");
                    double ancho = scanner.nextDouble();
                    figuraGeometrica = new Rectangulo(largo, ancho, "Rectangulo");
                    break;
                case 5:
                    out.print("Ingrese el lado del rombo: ");
                    double ladoRombo = scanner.nextDouble();
                    figuraGeometrica = new Rombo(ladoRombo, 0, 0, "Rombo");
                    break;
                case 6:
                    out.print("Ingrese la base del romboide: ");
                    double base = scanner.nextDouble();
                    out.print("Ingrese la altura del romboide: ");
                    double altura = scanner.nextDouble();
                    figuraGeometrica = new Romboide(base, altura, "Romboide");
                    break;
                case 7:
                    out.print("Ingrese la longitud de la base mayor: ");
                    double baseMayor = scanner.nextDouble();
                    out.print("Ingrese la longitud de la base menor: ");
                    double baseMenor = scanner.nextDouble();
                    out.print("Ingrese la longitud de un lado: ");
                    double ladoA = scanner.nextDouble();
                    out.print("Ingrese la longitud del otro lado: ");
                    double ladoB = scanner.nextDouble();
                    figuraGeometrica = new Trapecio(baseMayor, baseMenor, 0, ladoA, ladoB, "Trapecio");
                    break;
                case 8:
                    out.print("Ingrese el número de lados del polígono: ");
                    int numeroLados = scanner.nextInt();
                    out.print("Ingrese la longitud de un lado: ");
                    double longitudLado = scanner.nextDouble();
                    out.print("Ingrese el nombre de la figura: ");
                    String nombrePoligono = scanner.nextLine();
                    figuraGeometrica = new PoligonoRegular(numeroLados, longitudLado, nombrePoligono);
                    break;
                case 9:
                    out.print("Saliendo...\n");
                    out.print("\n");
                    break;
                default:
                    out.println("Opción inválida\n");
                    break;
            }
            if (figuraGeometrica != null) {
                Imprimir.imprimirPerimetro(figuraGeometrica);
            }
        } else {
            out.println("\n¡Por favor, ingrese un número entero correspondiente a una opción del menú!\n");
            scanner.nextLine();
            tipoFigura = 0;
        }

    }
}
