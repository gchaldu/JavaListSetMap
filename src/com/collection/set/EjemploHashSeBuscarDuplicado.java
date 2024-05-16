package com.collection.set;

import java.util.HashSet;
import java.util.Set;

public class EjemploHashSeBuscarDuplicado {
    public static void main(String[] args) {
        String[] lenguajes = {"Java", "C", "TypeScript", "Dark", "HTML", "CSS", "C"};

        Set<String> unicos = new HashSet<>();
        Set<String> duplicados = new HashSet<>();

        //Mostrar duplicados
        for(String len: lenguajes){
            if(!unicos.add(len)){
                System.out.println("Duplicados = " + len);
                duplicados.add(len);
            }
        }

        unicos.removeAll(duplicados);
        System.out.println(unicos);
        System.out.println(duplicados);
    }
}
