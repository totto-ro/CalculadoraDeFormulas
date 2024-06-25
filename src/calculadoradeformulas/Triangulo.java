package calculadoradeformulas;

public class Triangulo extends Figura2D {
    private double lado1;
    private double lado2;
    private double lado3;

    public Triangulo(double lado1, double lado2, double lado3, String nombre) {
        super(nombre);
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public String getNombre() {
        return nombre;
    }

    

    @Override
    public double calcularArea() {
        // Usar la fórmula de Herón para el área del triángulo
        double s = (lado1 + lado2 + lado2) / 2;
        return Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));
    }

    @Override
    public double calcularPerimetro() {
        return lado1 + lado2 + lado3;
    }
}
