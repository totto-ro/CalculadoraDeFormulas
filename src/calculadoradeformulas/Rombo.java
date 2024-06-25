package calculadoradeformulas;

public class Rombo extends Figura2D {
    private double lado;
    private double diagonal1;
    private double diagonal2;

    public Rombo(double lado, double diagonal1, double diagonal2, String nombre) {
        super(nombre);
        this.lado = lado;
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public double calcularArea() {
        return (diagonal1 * diagonal2) / 2;
    }

    @Override
    public double calcularPerimetro() {
        return 4 * lado;
    }
}
