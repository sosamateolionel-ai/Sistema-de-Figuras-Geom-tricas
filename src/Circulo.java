public class Circulo extends FiguraGeometrica {
    private double radio;

    public Circulo(String color, int x, int y, double radio) {
        super(color, x, y);
        this.radio = radio;
    }

    public double getRadio() { return radio; }

    // Área = π · r²
    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    // Perímetro (circunferencia) = 2 · π · r
    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }

    @Override
    public String toString() {
        return "[CÍRCULO] " + super.toString() +
                " | Radio: " + String.format("%.2f", radio);
    }
}