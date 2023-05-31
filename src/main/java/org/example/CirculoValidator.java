package org.example;

import sun.security.validator.Validator;

import java.util.function.Predicate;

public class CirculoValidator implements Predicate<Circulo> {
    @Override
    public boolean test(Circulo circulo) {
        if (circulo.radio > 0)
            return true;
        else
            return false;
    }
}
