import org.example.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertAll;

public class TableroTest {

    static IFactoriaFiguras FInicial;
    static IColeccionItems Tablero;

    @BeforeClass
    static public void inicial() {
        Tablero = new Tablero();
        FInicial = new FactoriaDeFiguras();
        Tablero.add(FInicial.dameFigura(Forma.Cuadrado, 2));
        Tablero.add(FInicial.dameFigura(Forma.Rectangulo, 2, 4));
        Tablero.add(FInicial.dameFigura(Forma.Circulo, 2));
    }

    @Test
    @DisplayName("AreaCuadrado")
    public void ComprobacionArea() {
        assertAll(
                () -> assertEquals(24.566, Tablero.dameArea(), 0.001)
        );
    }
    @Test
    @DisplayName("AreaCuadrado")
    public void ComprobacionPerimetro() {
        assertAll(
                () -> assertEquals(32.5663, Tablero.damePerimetro(), 0.001)
        );
    }
}