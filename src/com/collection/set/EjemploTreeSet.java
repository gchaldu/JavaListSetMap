package com.collection.set;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class EjemploTreeSet {
    public static void main(String[] args) {
        Set<String> ts = new TreeSet<>();

        ts.add("uno");
        ts.add("dos");
        ts.add("tres");
        ts.add("cuatro");
        ts.add("cinco");

        //guarda los datos ordenados
        System.out.println(ts);

        //Ordenar e forma asc o desc un arbol
        Set<String> ts2 = new TreeSet<>(Comparator.reverseOrder());

        ts2.add("uno");
        ts2.add("dos");
        ts2.add("tres");
        ts2.add("cuatro");
        ts2.add("cinco");

        System.out.println("ts2 = " + ts2);

        //Otra forma de ordenar con lambda
        Set<String> ts3 = new TreeSet<>( (a , b) -> {
            return b.compareTo(a);
        } );

        //eliminar
        
        ts2.remove("Tres");
        System.out.println("ts2 = " + ts2);
    }
}
