package com.collection.set;

import com.collection.user.User;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetCrud {
    public static void main(String[] args) {
        Set<User> users = new LinkedHashSet<>();

        // Crear
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
    }
}
