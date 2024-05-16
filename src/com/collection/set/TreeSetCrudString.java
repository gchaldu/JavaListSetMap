package com.collection.set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetCrudString {
    public static void main(String[] args) {
        Set<String> strings = new TreeSet<>();

        // Crear
        strings.add("Ana");
        strings.add("Pepe");

        // Leer
        for (String s : strings) {
            System.out.println(s);
        }

        // Actualizar
        strings.remove("Ana");
        strings.add("Pepe Updated");

        // Eliminar
        strings.remove("Pepe");

        // Leer después de actualizar y eliminar
        for (String s : strings) {
            System.out.println(s);
        }
    }
}
