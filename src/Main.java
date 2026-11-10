//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    FiguraGeometrica[] figuras = {
            new Circulo("Rojo", 0, 0, 5),
            new Rectangulo("Azul", 2, 3, 6, 4),
            new Triangulo("Verde", -1, 4, 3, 4, 5)
    };

    System.out.println("=== REPORTE DE FIGURAS ===\n");
    double areaTotal = 0;
    for (FiguraGeometrica f : figuras) {
        System.out.println(f);
        System.out.printf("   Área: %.2f | Perímetro: %.2f%n%n",
                f.calcularArea(), f.calcularPerimetro());
        areaTotal += f.calcularArea();
    }

    System.out.println("------------------------------");
    System.out.printf("Área total del dibujo: %.2f%n", areaTotal);

}
