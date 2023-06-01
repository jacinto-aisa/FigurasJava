package org.example;

public interface IColeccionItems extends IFigurable{
    void add(IFigurable figura);
    void addAll(Iterable<IFigurable> coleccion );
}
