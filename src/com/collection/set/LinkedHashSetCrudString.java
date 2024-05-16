package com.collection.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetCrudString {
    public static void main(String[] args) {
        Set<String> strings = new LinkedHashSet<>();

        // Crear
        strings.add("Ana");
        strings.add("Pepe");

        // Leer
        for (String s : strings) {
            System.out.println(s);
        }

        // Actualizar
        strings.remove("Ana");
        strings.add("Ana Updated");

        // Eliminar
        strings.remove("Pepe");

        // Leer después de actualizar y eliminar
        for (String s : strings) {
            System.out.println(s);
        }
    }
}
