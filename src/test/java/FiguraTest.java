import org.example.*;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertAll;

public class FiguraTest {
    static IFactoriaFiguras FInicial ;
    @BeforeClass
    public static void inicial()
    {
        FInicial = new FactoriaDeFiguras();
    }
    @Test
    @DisplayName("AreaCuadrado")
    public void ComprobacionAreaCuadrado()
    {
        assertAll(
                ()-> assertEquals(75.26,
                   (FInicial.dameFigura(Forma.Cuadrado,8.6755238364654))
                           .dameArea(),0.01),
                ()->assertEquals(4,
                   (FInicial.dameFigura(Forma.Cuadrado,2)
                           .dameArea()),0.01),
                ()->Assert.assertNull(FInicial.dameFigura(Forma.Cuadrado,-2)),
                ()->Assert.assertNotNull(FInicial.dameFigura(Forma.Cuadrado,22))
        );
    }
    @Test
    @DisplayName("PerimetroCuadrado")
    public void ComprobacionPerimetroCuadrado()
    {
         assertAll(
                ()->assertEquals(8,
                        (FInicial.dameFigura(Forma.Cuadrado,2))
                                .damePerimetro(),0.01),
                ()->assertEquals(16,
                        (FInicial.dameFigura(Forma.Cuadrado, 4))
                                .damePerimetro(),0.01)
        );
    }
    @Test
    @DisplayName("SuperficieRectangulo")
    public void ComprobacionAreaRectngulo()
    {
              assertAll(
                ()->assertEquals(
                        8,
                        (FInicial.dameFigura(Forma.Rectangulo,2,4).dameArea()),0.01),
                ()->assertEquals(8,
                        (FInicial.dameFigura(Forma.Rectangulo,4,2).dameArea()), 0.01),
                ()->Assert.assertNotNull(
                         FInicial.dameFigura(Forma.Rectangulo,5,3)),
                ()->Assert.assertNull(
                        FInicial.dameFigura(Forma.Rectangulo,-5,3)),
                ()->Assert.assertNull(
                        FInicial.dameFigura(Forma.Rectangulo,4,-5))
        );
    }
    @Test
    @DisplayName("PerimetroRectangulo")
    public void ComprobacionPerimetroRectngulo()
    {
        assertAll(
                ()->assertTrue(FInicial.dameFigura(Forma.Rectangulo,4,2).dameForma()==Forma.Rectangulo),
                ()->assertFalse(FInicial.dameFigura(Forma.Rectangulo,4,2).dameForma()==Forma.Cuadrado),
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
