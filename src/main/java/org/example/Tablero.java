package org.example;

import java.util.ArrayList;
import java.util.Collection;

public class Tablero implements IColeccionItems{
    private ArrayList<IFigurable> coleccionFig = new ArrayList<>();

    @Override
    public void add(IFigurable figura) {
        coleccionFig.add(figura);
    }

    @Override
    public void addAll(Iterable<IFigurable> coleccion) {
        coleccionFig.addAll((Collection<? extends IFigurable>) coleccion);
    }

    @Override
    public double dameArea() {
        return coleccionFig.stream().mapToDouble(IFigurable::dameArea).sum();
    }

    @Override
    public double damePerimetro() {
        return coleccionFig.stream().mapToDouble(IFigurable::damePerimetro).sum();
    }

    @Override
    public Forma dameForma() {
        return null;
    }


}
