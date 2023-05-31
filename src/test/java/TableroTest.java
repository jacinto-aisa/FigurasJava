import org.example.Circulo;
import org.example.Cuadrado;
import org.example.IFigurable;
import org.example.Rectangulo;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import java.nio.channels.OverlappingFileLockException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertAll;

public class TableroTest {

    @Test
    @DisplayName("AreaCuadrado")
    public void ComprobacionAreaCuadrado()
    {
        assertAll(
                ()-> assertEquals(75.26,new Cuadrado(8.6755238364654).dameArea(),0.01),
                ()->assertEquals(4,new Cuadrado(2).dameArea(),0.01)
        );

    }

    @Test
    @DisplayName("PerimetroCuadrado")
    public void ComprobacionPerimetroCuadrado()
    {

        assertAll(
                ()->assertEquals(8,new Cuadrado(2).damePerimetro(),0.01),
                ()->assertEquals(16,new Cuadrado(4).damePerimetro(),0.01)
        );


    }


    @Test
    @DisplayName("SuperficieRectangulo")
    public void ComprobacionAreaRectngulo()
    {

        assertAll(
                ()->assertEquals(8,new Rectangulo(4,2).dameArea(),0.01),
                ()->assertEquals(8,new Rectangulo(2,4).dameArea(),0.01)
        );
    }
    @Test
    @DisplayName("PerimetroRectangulo")
    public void ComprobacionPerimetroRectngulo()
    {

        assertAll(
                ()->assertEquals(12,new Rectangulo(4,2).damePerimetro(),0.01),
                ()->assertEquals(12,new Rectangulo(2,4).damePerimetro(),0.01)
        );
    }
    @Test
    @DisplayName("AreaCiruclo")
    public void ComprobacionAreaCirculo()
    {

        assertAll(
                ()->assertEquals(28.2744,new Circulo(3).dameArea(),0.01),
                ()->assertEquals(50.2656,new Circulo(4).dameArea(),0.01)
        );
    }
    @Test
    @DisplayName("PerimetroCirculo")
    public void ComprobacionPerimetroCirculo()
    {

        assertAll(
                ()->assertEquals(12.5664,new Circulo(2).damePerimetro(),0.01),
                ()->assertEquals(25.1327,new Circulo(4).damePerimetro(),0.01)
        );
    }
    }
