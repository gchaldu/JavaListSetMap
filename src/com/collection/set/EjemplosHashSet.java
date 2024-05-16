package com.collection.set;

import java.util.*;

public class EjemplosHashSet {
    public static void main(String[] args) {
        Set<String> hs = new HashSet<>();

        hs.add("uno");
        hs.add("dos");
        hs.add("tres");
        hs.add("cuatro");
        hs.add("cinco");

        // Iterar sobre los elementos y mostrar sus hashCodes
        for (String element : hs) {
            int hashCode = element.hashCode();
            System.out.println("Elemento: " + element + ", hashCode: " + hashCode);
        }
        System.out.println();
        System.out.println();
        //No acepta repetidos
        boolean ok = hs.add("seis");
        System.out.println(hs + " OK: " + ok);

        //Ordenar Set
        List<String> stringList = new ArrayList<>(hs);
        Collections.sort(stringList);

    }
}
