public abstract class FiguraGeometrica {
    protected String color;
    protected int x; // posición en el plano
    protected int y;

    public FiguraGeometrica(String color, int x, int y) {
        this.color = color;
        this.x = x;
        this.y = y;
    }

    public String getColor() { return color; }
    public int getX() { return x; }
    public int getY() { return y; }

    // Cada figura aplica su propia fórmula
    public abstract double calcularArea();
    public abstract double calcularPerimetro();

    @Override
    public String toString() {
        return "Color: " + color + " | Posición: (" + x + ", " + y + ")";
    }
}