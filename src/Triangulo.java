public class Triangulo extends FiguraGeometrica {
    private double lado1;
    private double lado2;
    private double lado3;

    public Triangulo(String color, int x, int y, double lado1, double lado2, double lado3) {
        super(color, x, y);
        // Desigualdad triangular: cada lado debe ser menor que la suma de los otros dos
        if (lado1 + lado2 <= lado3 || lado1 + lado3 <= lado2 || lado2 + lado3 <= lado1) {
            throw new IllegalArgumentException("Los lados no forman un triángulo válido.");
        }
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    // Área por la fórmula de Herón: √(s · (s-a) · (s-b) · (s-c)), con s = semiperímetro
    @Override
    public double calcularArea() {
        double s = calcularPerimetro() / 2;
        return Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));
    }

    // Perímetro = suma de los tres lados
    @Override
    public double calcularPerimetro() {
        return lado1 + lado2 + lado3;
    }

    @Override
    public String toString() {
        return "[TRIÁNGULO] " + super.toString() +
                " | Lados: " + String.format("%.2f", lado1) + " / " +
                String.format("%.2f", lado2) + " / " +
                String.format("%.2f", lado3);
    }
}