package org.example;

public class Cuadrado implements IFigurable{
    double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double dameArea() {
        return Math.pow(lado,2);
    }
    @Override
    public double damePerimetro() {
        return lado*4;
    }

    @Override
    public String toString() {
        return "Cuadrado{" + "\n" +
                "lado=" + lado + "\n" +
                "area=" + dameArea() + "\n" +
                "perimetro= " + damePerimetro();
    }
}
