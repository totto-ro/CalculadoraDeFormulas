package calculadoradeformulas;

public class Romboide extends Figura2D {

    private double base;
    private double altura;

    public Romboide(double base, double altura, String nombre) {
        super(nombre);
        this.base = base;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }


    @Override
    public double calcularArea() {
        return base * altura;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * (base + altura);
    }
}
