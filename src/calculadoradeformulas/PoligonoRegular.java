package calculadoradeformulas;

public class PoligonoRegular extends Figura2D {
    private int numeroLados;
    private double longitudLado;

    public PoligonoRegular(int numeroLados, double longitudLado, String nombre) {
        super(nombre);
        this.numeroLados = numeroLados;
        this.longitudLado = longitudLado;
    }

    public String getNombre() {
        return nombre;
    }


    @Override
    public double calcularArea() {
        double apotema = longitudLado / (2 * Math.tan(Math.PI / numeroLados));
        return (calcularPerimetro() * apotema) / 2;
    }

    @Override
    public double calcularPerimetro() {
        return numeroLados * longitudLado;
    }
}

