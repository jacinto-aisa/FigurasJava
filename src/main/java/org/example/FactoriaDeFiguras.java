package org.example;

import java.util.Scanner;

public class FactoriaDeFiguras implements IFactoriaFiguras{
    @Override
    public IFigurable dameFigura(Forma tipoFigura, double... valor) {
        switch (tipoFigura)
        {
            case Circulo:
                Circulo miCirculo = new Circulo(valor[0]);
                if (new CirculoValidator().test(miCirculo))
                    return miCirculo;
                else
                    return null;
            case Cuadrado:
                Cuadrado miCuadrado = new Cuadrado(valor[0]);
                if (new CuadradoValidator().test(miCuadrado))
                    return miCuadrado;
                else
                    return null;
            case Rectangulo:
                Rectangulo miRectangulo = new Rectangulo(valor[0],valor[1]);
                if (new RectanguloValidator().test(miRectangulo))
                    return miRectangulo;
                else
                    return null;
        }
        return null;
    }
}
