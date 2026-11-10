public class Rectangulo extends FiguraGeometrica {
    private double base;
    private double altura;

    public Rectangulo(String color, int x, int y, double base, double altura) {
        super(color, x, y);
        this.base = base;
        this.altura = altura;
    }

    public double getBase() { return base; }
    public double getAltura() { return altura; }

    // Área = base · altura
    @Override
    public double calcularArea() {
        return base * altura;
    }

    // Perímetro = 2 · (base + altura)
    @Override
    public double calcularPerimetro() {
        return 2 * (base + altura);
    }

    @Override
    public String toString() {
        return "[RECTÁNGULO] " + super.toString() +
                " | Base: " + String.format("%.2f", base) +
                " | Altura: " + String.format("%.2f", altura);
    }
}