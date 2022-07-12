package org.aguzman.optional.ejemplo;

import org.aguzman.optional.ejemplo.models.Computador;
import org.aguzman.optional.ejemplo.repositorio.ComputadorRepositorio;
import org.aguzman.optional.ejemplo.repositorio.Repositorio;

import java.util.Optional;

public class EjemploRepositorio {
    public static void main(String[] args) {

        Repositorio<Computador>repositorio= new ComputadorRepositorio();

        repositorio.filtar("rog").ifPresentOrElse(System.out::println,
                ()-> System.out.println("No se encontro"));
        //Optional<Computador> pc=repositorio.filtar("asus rog");

        /*if (pc.isPresent()){
            System.out.println(pc.get());
        } else {
            System.out.println("No se encontro");
        }*/



    }
}
