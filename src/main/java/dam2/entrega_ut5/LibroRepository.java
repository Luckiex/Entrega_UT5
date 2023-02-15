package dam2.entrega_ut5;

import dam2.entrega_ut5.model.Libro;
import org.springframework.data.repository.CrudRepository;

public interface LibroRepository extends CrudRepository<Libro,Long> {}