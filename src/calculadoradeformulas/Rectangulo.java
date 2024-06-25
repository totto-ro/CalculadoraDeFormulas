package calculadoradeformulas;

public class Rectangulo extends Figura2D {
    private double largo;
    private double ancho;

    public Rectangulo(double largo, double ancho, String nombre) {
        super(nombre);
        this.largo = largo;
        this.ancho = ancho;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public double calcularArea() {
        return largo * ancho;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * (largo + ancho);
    }
}
