package org.aguzman.optional.ejemplo.repositorio;

import org.aguzman.optional.ejemplo.models.Computador;

import java.util.Optional;

public interface Repositorio<T> {
    Optional<Computador> filtar(String nombre);
}
