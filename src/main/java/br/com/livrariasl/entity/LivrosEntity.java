package br.com.livrariasl.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table ( name = "tb_livrosSL")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LivrosEntity {

    @Id
    @GeneratedValue ( strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;

    @Column(length = 1000)
    private String imagemUrl;

    @Column(length = 1000)
    private String sinopse;

    private String valor;

    @Column(length = 1000)
    private String linkLivro;

    @Enumerated(EnumType.STRING)
    private Genero genero;

    @ManyToOne(optional = false)
    @JoinColumn(name = "autor_id", nullable = false)
    @JsonBackReference // Para evitar loop infinito

    private AutorEntity autor;

}
