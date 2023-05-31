package org.example;

import com.sun.javafx.fxml.expression.Expression;

import java.util.function.Predicate;

public class RectanguloValidator implements Predicate<Rectangulo> {

    @Override
    public boolean test(Rectangulo rectangulo) {
        if (rectangulo.ladoCorto > 0 && rectangulo.ladoLargo > 0)
            return true;
        else
            return false;

    }
}
