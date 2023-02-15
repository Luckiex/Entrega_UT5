package dam2.entrega_ut5.controller;

import dam2.entrega_ut5.LibroServiceImplementation;
import dam2.entrega_ut5.model.Libro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class WebController
{
    @Autowired
    private LibroServiceImplementation libroServiceImplementation;

    @PostMapping("/Agregar")
    public void agregarLibro(Libro libro)
    {
        libroServiceImplementation.saveLibro(libro);
    }

    @GetMapping("/Obtener")
    public List<Libro> listaLibro()
    {
        return libroServiceImplementation.findAll();
    }

    @PutMapping("/Modificar/{id}")
    public Libro updateLibro(@PathVariable Long id, Libro libro)
    {
        return libroServiceImplementation.updateLibro(id, libro);
    }

    @DeleteMapping("/Borrar/{id}")
    public void deleteLibro(@PathVariable Long id)
    {
        libroServiceImplementation.deleteLibro(id);
    }
}
