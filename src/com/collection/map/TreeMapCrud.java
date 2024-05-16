package com.collection.map;

import com.collection.user.User;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapCrud {
    public static void main(String[] args) {
        Map<Integer, User> users = new TreeMap<>();

        // Crear
        users.put(1, new User("1", "Ana"));
        users.put(2, new User("2", "Pepe"));

        // Leer
        for (Map.Entry<Integer, User> user : users.entrySet()) {
            System.out.println(user.getKey() + " -> " + user.getValue());
        }

        // Actualizar
        users.put(1, new User("1", "Ana Updated"));

        // Eliminar
        users.remove(2);

        // Leer después de actualizar y eliminar
        for (Map.Entry<Integer, User> user : users.entrySet()) {
            System.out.println(user.getKey() + " -> " + user.getValue());
        }
        // Buscar y retornar un String en el mapa por clave
        User userToFind = new User("2", "Pepe");
        if (users.containsKey(userToFind)) {
            User user = users.get(userToFind);
            System.out.println("Usuario encontrado en el mapa: " + user.getName());
        } else {
            System.out.println("Usuario no encontrado en el mapa para la clave: " + userToFind);
        }
    }
}
