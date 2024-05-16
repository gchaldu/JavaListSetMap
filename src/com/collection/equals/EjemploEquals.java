package com.collection.equals;

import com.collection.user.User;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class EjemploEquals {
    public static void main(String[] args) {
        User user1 = new User("1", "Alice");
        User user2 = new User("1", "Alice");
        User user3 = new User("2", "Bob");

        System.out.println("Mismo id: " + user1.equals(user2));
        System.out.println( "Referencias iguales" + user3.equals(user3));
        System.out.println("Diferentes ids: " + user1.equals(user3));
        System.out.println(user1.equals("Objeto comparado es null" + null));
    }
}
