package dam2.entrega_ut5;

import dam2.entrega_ut5.model.Libro;

import java.util.List;
import java.util.Optional;

public interface LibroService
{
    List<Libro> findAll();
    Optional<Libro> findById(Long id);
    void saveLibro(Libro libro);
    Libro updateLibro(Long id, Libro libro);
    void deleteLibro(Long id);
}
