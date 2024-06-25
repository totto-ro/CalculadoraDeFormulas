package calculadoradeformulas;

import java.io.PrintStream;

public class Imprimir {

    static PrintStream out = System.out;

    public static void imprimirPerimetro(Figura2D figura) {
        String resultadoFormateado = String.format("%.2f", figura.calcularPerimetro());
        out.println("El perímetro de " + figura.getNombre() + " es: " + resultadoFormateado);
        out.println();

    }

}
