package calculadoradeformulas;

public class Cuadrado extends Figura2D {
    private double lado;

    public Cuadrado(double lado, String nombre) {
        super(nombre);
        this.lado = lado;
    }

    public String getNombre() {
        return nombre;
    }


    @Override
    public double calcularArea() {
        return lado * lado;
    }

    @Override
    public double calcularPerimetro() {
        return 4 * lado;
    }
}
