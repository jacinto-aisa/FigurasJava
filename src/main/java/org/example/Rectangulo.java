package org.example;

public class Rectangulo implements IFigurable
{
    double ladoLargo;
    double ladoCorto;

    public Rectangulo(double ladoLargo, double ladoCorto) {
        this.ladoLargo = ladoLargo;
        this.ladoCorto = ladoCorto;
    }

    @Override
    public double dameArea() {
        return ladoLargo*ladoCorto;
    }
    @Override
    public Forma dameForma() {
        return Forma.Rectangulo;
    }
    @Override
    public double damePerimetro() {
        return 2*ladoLargo+2*ladoCorto;
    }
}