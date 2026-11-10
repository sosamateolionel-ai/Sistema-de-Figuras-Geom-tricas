# Sistema de Figuras Geométricas

## Descripción
Este proyecto desarrolla un sistema de representación y cálculo de figuras geométricas utilizando Java y Programación Orientada a Objetos.

Permite crear diferentes figuras, como círculos, rectángulos y triángulos, almacenando sus características y posiciones en un plano. Cada figura implementa sus propias fórmulas para calcular el área y el perímetro.

## Funcionamiento del programa

El programa crea tres figuras geométricas:

- **Círculo:** color rojo, posición (0, 0) y radio de 5 unidades.
- **Rectángulo:** color azul, posición (2, 3), base de 6 unidades y altura de 4 unidades.
- **Triángulo:** color verde, posición (-1, 4) y lados de 3, 4 y 5 unidades.

Las figuras se almacenan en un arreglo de tipo `FiguraGeometrica[]`.

Luego, mediante un ciclo `for`, el programa recorre cada elemento y muestra:

1. El tipo de figura, su color y su posición.
2. Sus dimensiones particulares.
3. El área calculada.
4. El perímetro correspondiente.

Finalmente, acumula las áreas individuales y muestra el área total del dibujo.

## Clases principales

| Clase | Responsabilidad |
|---|---|
| `FiguraGeometrica` | Clase abstracta que contiene los atributos comunes y define los métodos abstractos para calcular área y perímetro. |
| `Circulo` | Hereda de `FiguraGeometrica` y calcula el área y la circunferencia utilizando el radio. |
| `Rectangulo` | Hereda de `FiguraGeometrica` y calcula el área y el perímetro utilizando la base y la altura. |
| `Triangulo` | Hereda de `FiguraGeometrica`, valida sus lados y calcula el área mediante la fórmula de Herón. |
| `Main` | Crea las figuras, muestra sus resultados y calcula el área total. |

## Conceptos de programación aplicados

- **Abstracción:** `FiguraGeometrica` se declara como clase abstracta y define una estructura común para todas las figuras.
- **Herencia:** las clases `Circulo`, `Rectangulo` y `Triangulo` heredan de la clase abstracta.
- **Polimorfismo:** se utiliza un arreglo `FiguraGeometrica[]` para almacenar diferentes tipos de figuras.
- **Métodos abstractos:** `calcularArea()` y `calcularPerimetro()` obligan a las subclases a implementar sus propias fórmulas.
- **Sobrescritura de métodos:** cada figura redefine los métodos de cálculo y `toString()` mediante `@Override`.
- **Encapsulamiento:** se utilizan atributos `protected` en la clase base y atributos `private` en las clases derivadas.
- **Constructores con `super()`:** permiten inicializar los atributos heredados.
- **Validación de datos:** el triángulo comprueba la desigualdad triangular y utiliza `IllegalArgumentException` cuando sus lados no forman una figura válida.
- **Fórmulas matemáticas:** se utilizan `Math.PI`, `Math.sqrt()` y operaciones aritméticas para realizar los cálculos.

## Fórmulas utilizadas

| Figura | Área | Perímetro |
|---|---|---|
| Círculo | π × radio² | 2 × π × radio |
| Rectángulo | base × altura | 2 × (base + altura) |
| Triángulo | Fórmula de Herón | lado1 + lado2 + lado3 |

**Fórmula de Herón:**

\[
A=\sqrt{s(s-a)(s-b)(s-c)}
\]

Donde `s` representa el semiperímetro del triángulo.

## Tecnologías utilizadas

- Lenguaje: Java.
- Entorno de desarrollo: IntelliJ IDEA.
- Librerías: `java.lang.Math`.
- Paradigma: Programación Orientada a Objetos.

## Ejecución

<img width="620" height="340" alt="image" src="https://github.com/user-attachments/assets/14cf750b-3bf5-467c-b73f-bb963f4537fe" />

## Resultado esperado

El programa calcula los siguientes valores:

| Figura | Área | Perímetro |
|---|---:|---:|
| Círculo | 78,54 | 31,42 |
| Rectángulo | 24,00 | 20,00 |
| Triángulo | 6,00 | 12,00 |

<text weight="semibold">Área total del dibujo: 108,54 unidades cuadradas.</text>

## Objetivo del ejercicio

Aplicar los conceptos de abstracción, herencia y polimorfismo mediante una clase abstracta que permita representar distintas figuras geométricas y calcular sus propiedades utilizando fórmulas específicas para cada una.

## Estructura del proyecto

```text
SistemaFigurasGeometricas/
├── FiguraGeometrica.java
├── Circulo.java
├── Rectangulo.java
├── Triangulo.java
├── Main.java
└── README.md
```

**Nombre sugerido para el repositorio:** `sistema-figuras-geometricas`

## Observación

La clase `Triangulo` valida que sus lados cumplan la desigualdad triangular. Sin embargo, no comprueba explícitamente que las longitudes sean positivas, por lo que sería conveniente agregar esa validación para evitar valores incorrectos.
