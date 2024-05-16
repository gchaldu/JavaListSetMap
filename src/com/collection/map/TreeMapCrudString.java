package com.collection.map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapCrudString {
    public static void main(String[] args) {
        Map<String, String> strings = new TreeMap<>();

        // Crear
        strings.put("1", "Ana");
        strings.put("2", "Pepe");

        // Leer
        for (Map.Entry<String, String> entry : strings.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // Actualizar
        strings.put("1", "Ana Updated");

        // Eliminar
        strings.remove("2");

        // Leer después de actualizar y eliminar
        for (Map.Entry<String, String> entry : strings.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
