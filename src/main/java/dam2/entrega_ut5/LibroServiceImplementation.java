package dam2.entrega_ut5;

import dam2.entrega_ut5.model.Libro;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class LibroServiceImplementation implements LibroService
{
    @Autowired
    private LibroRepository libroRespository;

    @Override
    public List<Libro> findAll()
    {
        return (List<Libro>) libroRespository.findAll();
    }

    @Override
    public Optional<Libro> findById(Long id)
    {
        return libroRespository.findById(id);
    }

    @Override
    public void saveLibro(Libro libro)
    {
        libroRespository.save(libro);
    }

    @Override
    public Libro updateLibro(Long id, Libro libro)
    {
        if(libroRespository.findById(id).isPresent())
            libroRespository.save(libro);
        return libro;
    }

    @Override
    public void deleteLibro(Long id)
    {
        libroRespository.deleteById(id);
    }
}
