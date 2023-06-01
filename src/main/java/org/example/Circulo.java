package org.example;

public class Circulo implements IFigurable{
    double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double dameArea() {
        return Math.PI*Math.pow(radio,2);
    }

    @Override
    public double damePerimetro() {
        return 2*Math.PI*radio;
    }

    @Override
    public Forma dameForma() {
        return Forma.Circulo;
    }
}
