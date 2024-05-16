package com.collection.set;

import com.collection.user.User;

import java.util.HashSet;
import java.util.Set;

public class HashSetCrud {
    public static void main(String[] args) {
        Set<User> users = new HashSet<>();

        // Crear
        users.add(new User("1", "Ana"));
        users.add(new User("1", "Ana"));
        users.add(new User("2", "Pepe"));

        // Leer
        for (User user : users) {
            System.out.println(user);
        }

        // Actualizar
        User userToUpdate = new User("1", "Ana Updated");
        users.remove(new User("1", "Ana"));
        users.add(userToUpdate);

        // Eliminar
        users.remove(new User("2", "Pepe"));

        // Leer después de actualizar y eliminar
        for (User user : users) {
            System.out.println(user);
        }

        // Buscar y retornar un String en el conjunto
        User userFind = new User("1", "Ana");
        if (users.contains(userFind)) {
            System.out.println("Elemento encontrado en el conjunto: " + userFind);
        } else {
            System.out.println("Elemento no encontrado en el conjunto: " + userFind);
        }

        // Buscar y retornar un User en el conjunto por su ID
        String userIdToFind = "1";
        User userFound = null;
        for (User user : users) {
            if (user.getId().equals(userIdToFind)) {
                userFound = user;
                break;
            }
        }
        if (userFound != null) {
            System.out.println("Usuario encontrado en el conjunto: " + userFound);
        } else {
            System.out.println("Usuario no encontrado en el conjunto para el ID: " + userIdToFind);
        }

    }
}
