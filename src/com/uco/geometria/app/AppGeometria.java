package com.uco.geometria.app;

import com.uco.geometria.dominio.Circulo;
import com.uco.geometria.dominio.Cuadrilatero;
import com.uco.geometria.dominio.FiguraGeometrica;

import java.util.ArrayList;
import java.util.List;

public class AppGeometria {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(60);
        Cuadrilatero cuadrado = new Cuadrilatero(4, 5);
        FiguraGeometrica figuraGeometrica = new Cuadrilatero(5, 8);

        List<FiguraGeometrica> figuras = new ArrayList<>();
        figuras.add(circulo);
        figuras.add(cuadrado);
        figuras.add(figuraGeometrica);

        figuras.forEach(figura -> {
            System.out.println(figura);
            System.out.println("Área: " + figura.calcularArea());
            System.out.println("Perímetro: " + figura.calcularPerimetro());
        });
    }
}
