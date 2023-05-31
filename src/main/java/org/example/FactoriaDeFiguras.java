package org.example;

import java.util.Scanner;

public class FactoriaDeFiguras implements IFactoriaFiguras{
    @Override
    public IFigurable dameFigura(Forma tipoFigura, double valor) {
        switch (tipoFigura)
        {
            case Circulo:
                Circulo miCirculo = new Circulo(valor);
                if (new CirculoValidator().test(miCirculo))
                    return miCirculo;
                else
                    return null;
            case Cuadrado:
                Cuadrado miCuadrado = new Cuadrado(valor);
                if (new CuadradoValidator().test(miCuadrado))
                    return miCuadrado;
                else
                    return null;

        }
        return null;
    }
}
