package dam2.entrega_ut5.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "Libro")
public class Libro implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "Título")
    private String titulo;

    @Column (name = "Autor")
    private String autor;

    @Column (name = "Precio")
    private double precio;

    @Column (name = "Genero")
    private String genero;
}
