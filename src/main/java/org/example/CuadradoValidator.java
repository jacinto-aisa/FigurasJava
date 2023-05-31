package org.example;

import java.util.function.Predicate;

public class CuadradoValidator implements Predicate<Cuadrado> {
    @Override
    public boolean test(Cuadrado cuadrado) {
        if (cuadrado.lado > 0)
            return true;
        else
            return false;
    }
}
